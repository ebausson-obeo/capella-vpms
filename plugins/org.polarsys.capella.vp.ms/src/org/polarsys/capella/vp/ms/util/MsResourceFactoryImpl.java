/*******************************************************************************
 * Copyright (c) 2017, 2020 THALES GLOBAL SERVICES.
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

package org.polarsys.capella.vp.ms.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!-- end-user-doc -->
 * 
 * @see org.polarsys.capella.vp.ms.ms.util.MsResourceImpl
 * @generated
 */
public class MsResourceFactoryImpl extends ResourceFactoryImpl {
  /**
   * Creates an instance of the resource factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public MsResourceFactoryImpl() {
    super();
  }

  /**
   * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Resource createResource(URI uri) {

    Resource result = new MsResourceImpl(uri);
    return result;

  }

} // MsResourceFactoryImpl
