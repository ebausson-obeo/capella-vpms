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
package org.polarsys.capella.core.data.common.statemachine.validation;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.sirius.analysis.SequenceDiagramServices;

public class MDCHK_InstanceRole_Component_FSM extends AbstractModelConstraint {
  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse .emf.validation.IValidationContext)
   */
  @Override
  public IStatus validate(IValidationContext ctx) {
    if (ctx.getTarget() instanceof InstanceRole) {
      InstanceRole instanceRole = (InstanceRole) ctx.getTarget();
      if (instanceRole.getRepresentedInstance().getType() instanceof Component) {
        Component systemComponent = (Component) instanceRole.getRepresentedInstance().getType();
        EList<StateMachine> stateMachines = systemComponent.getOwnedStateMachines();
        if (!stateMachines.isEmpty()) {
          List<EObject> orderedElementsOfInstanceRole = InteractionUtils.getOrderedElementsOfInstanceRole(instanceRole);
          EObject firstElement = InteractionUtils.getFirstElementInExecution(orderedElementsOfInstanceRole);
          if (firstElement != null) {
            if (firstElement instanceof State) {
              for (StateMachine stateMachine : stateMachines) {
                if (StateMachineUtils.getAllStates(stateMachine).contains(firstElement)) {
                  return ctx.createSuccessStatus();
                }
              }
            }
          }
          if (SequenceDiagramServices.getScenario(instanceRole).getPreCondition() == null
              || SequenceDiagramServices.getScenario(instanceRole).getPreCondition().getConstraints().isEmpty()) {
            return ctx.createFailureStatus(instanceRole.getName(), systemComponent.getName());
          }
        }
      }
      return ctx.createSuccessStatus();
    }
    return null;
  }
}
