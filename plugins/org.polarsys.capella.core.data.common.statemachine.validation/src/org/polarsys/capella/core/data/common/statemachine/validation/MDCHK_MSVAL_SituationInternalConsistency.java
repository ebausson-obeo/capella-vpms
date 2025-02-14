/*******************************************************************************
 * Copyright (c) 2017, 2020 ALTRAN.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Altran - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.common.statemachine.validation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.polarsys.capella.vp.ms.AndOperation;
import org.polarsys.capella.vp.ms.BooleanExpression;
import org.polarsys.capella.vp.ms.NotOperation;
import org.polarsys.capella.vp.ms.OrOperation;
import org.polarsys.capella.vp.ms.Situation;


public class MDCHK_MSVAL_SituationInternalConsistency extends AbstractModelConstraint {

  Collection<IStatus> objectsIrregularList = new ArrayList<IStatus>();

  @Override
  public IStatus validate(IValidationContext ctx) {
    objectsIrregularList.clear();
    EObject eObj = ctx.getTarget();
    if (eObj instanceof Situation) {
      checkOrAnd(((Situation) eObj).getExpression(), ctx);
      checkNot(((Situation) eObj).getExpression(), ctx);
    }
    if (objectsIrregularList.size() > 0) {
      return ConstraintStatus.createMultiStatus(ctx, objectsIrregularList);
    } else {
      return ctx.createSuccessStatus();
    }
  }

  private void checkOrAnd(BooleanExpression be, IValidationContext ctx){
    String error = "'AND' / 'OR' operator must have minimum 2 operands";
    if(be.eContents().size() < 2 && (be instanceof OrOperation || be instanceof AndOperation)){
      objectsIrregularList.add(ctx.createFailureStatus(error));
    }else{
      for(EObject obj : be.eContents()){
        if((BooleanExpression)obj instanceof OrOperation || (BooleanExpression)obj instanceof AndOperation){
          checkOrAnd((BooleanExpression)obj, ctx);
        }
      }
    }
  }

  private void checkNot(BooleanExpression be, IValidationContext ctx){
    String error = "'NOT' operator must have exactly one operand";
    if(be.eContents().size() > 1 && be instanceof NotOperation){
      objectsIrregularList.add(ctx.createFailureStatus(error));
    }else{
      for(EObject obj : be.eContents()){
        if((BooleanExpression)obj instanceof NotOperation){
          checkNot((BooleanExpression)obj, ctx);
        }
      }
    }
  }
}
