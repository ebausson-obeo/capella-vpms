/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.vp.ms.ui.css.dom;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.e4.ui.css.core.dom.ElementAdapter;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.common.helpers.EObjectLabelProviderHelper;
import org.polarsys.capella.vp.ms.ui.css.CSSAdapter;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EObjectElement extends ElementAdapter implements NodeList {

  public EObjectElement(EObject nativeWidget, CSSEngine engine) {
    super(nativeWidget, engine);
  }

  @Override
  public Node getParentNode() {
    return engine.getElement(((EObject)getNativeWidget()).eContainer());
  }

  @Override
  public NodeList getChildNodes() {
    return this;
  }

  @Override
  public String getNamespaceURI() {
    return ((EObject) getNativeWidget()).eClass().getEPackage().getNsURI();
  }

  @Override
  public String getCSSId() {
    return EcoreUtil.getID((EObject) getNativeWidget());
  }

  @Override
  public String getCSSClass() {
    CSSAdapter eObjectCss = (CSSAdapter) EcoreUtil.getExistingAdapter((EObject)getNativeWidget(), CSSAdapter.class);
    return eObjectCss == null ? null : eObjectCss.getCSSClass();
  }

  @Override
  public String getCSSStyle() {
    CSSAdapter eObjectCss = (CSSAdapter) EcoreUtil.getExistingAdapter((EObject)getNativeWidget(), CSSAdapter.class);
    return eObjectCss == null ? null : eObjectCss.getCSSStyle();
  }

  @Override
  public String getLocalName() {
    return ((EObject) getNativeWidget()).eClass().getName();
  }

  @Override
  public String getAttribute(String attr) {

    if ("class".equals(attr)) {
      return getCSSClass();
    }

    EObject widget = (EObject) getNativeWidget();
    for (EAttribute ea : widget.eClass().getEAllAttributes()) {
      if (attr.equals(ea.getName())){
        return EcoreUtil.convertToString(ea.getEAttributeType(), widget.eGet(ea));
      }
    }

    // treat references as absent if they're not set to anything, this way you can test
    // e.g. 
    //     ComponentPort[providedInterfaces] {
    //          something: something;
    //     }
    // and apply only if the port provides at least one interface
    for (EReference ref : widget.eClass().getEAllReferences()) {
      if (ref.getName().equals(attr)) {
        if (widget.eIsSet(ref)){
          if (ref.isMany()) {
            Collection<EObject> c = (Collection<EObject>) widget.eGet(ref);
            return c.stream().map(EObjectLabelProviderHelper::getText).collect(Collectors.joining(","));
          } else {
            return EObjectLabelProviderHelper.getText(widget.eGet(ref));
          }
        }
      }
    }

    return null;
  }

  @Override
  public final boolean hasAttribute(String attr) {
    return getAttribute(attr) != null;
  }

  @Override
  // children size
  public int getLength() {
    return ((EObject)getNativeWidget()).eContents().size();
  }

  @Override
  // child at i
  public Node item(int index) {
    return getElement(((EObject)getNativeWidget()).eContents().get(index));
  }

}
