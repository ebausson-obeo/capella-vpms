/*******************************************************************************
 * Copyright (c) 2018, 2020 THALES GLOBAL SERVICES.
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
package ms.design;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;

import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.polarsys.capella.common.helpers.EObjectLabelProviderHelper;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.ms.ui.css.CSSAdapter;

public class InterfaceDiagramMsRefreshExtension extends DefaultMsRefreshExtension {


  @Override
  public void postRefresh(DDiagram dDiagram) {
    refreshNodes(dDiagram);
  }

  @Override
  protected ScopeVisitor<?> createVisitor() {
    return new ConfigurationScopeVisitor() {

      @Override
      protected void updateStyle(AbstractDNodeScope asd) {
        AbstractDNode node = (AbstractDNode)asd.getElement(); 
        
        if (node.getTarget() instanceof Interface) {
          CSSAdapter interfaceStyle = CSSAdapter.getAdapter(node);
          for (DEdge edge : ((EdgeTarget) node).getIncomingEdges()){
            CSSAdapter portStyle = CSSAdapter.getAdapter(edge.getSourceNode());
            CSSAdapter edgeStyle = CSSAdapter.getAdapter(edge);
            interfaceStyle.addCSSClass(portStyle);
            edgeStyle.addCSSClass(portStyle);
          }
        } else {
          super.updateStyle(asd);
        }
      }

    };
  }

  @Override
  /**
   * Overridden to enforce a specific order for diagram scope children: We want to process components/parts
   * first and then the interfaces.
   */
  protected ScopeFactory createScopeFactory() {
    return new ScopeFactory() {
      @Override
      public Scope caseDSemanticDiagram(DSemanticDiagram diagram) {
        return new DiagramScope(diagram) {
          Collection<DDiagramElement> getChildren() {
            Deque<DDiagramElement> result = new ArrayDeque<DDiagramElement>();
            for (DDiagramElement elem : ((DSemanticDiagram)getElement()).getOwnedDiagramElements()) {              
              // the component must be last, because the children are processed in inverse order
              if (elem.getTarget() instanceof Component) {
                result.addLast(elem);
              } else if (elem.getTarget() instanceof Interface) {
                result.addFirst(elem);
              }
            }
            return result;
          }
        };
      }
    };
  }

}
