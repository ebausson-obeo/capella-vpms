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

package org.polarsys.capella.vp.ms;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>In Situation Expression</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.polarsys.capella.vp.ms.InSituationExpression#getSituation <em>Situation</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.ms.MsPackage#getInSituationExpression()
 * @model
 * @generated
 */

public interface InSituationExpression extends BooleanExpression {

  /**
   * Returns the value of the '<em><b>Situation</b></em>' reference.
   * 
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Situation</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Situation</em>' reference.
   * @see #setSituation(Situation)
   * @see org.polarsys.capella.vp.ms.MsPackage#getInSituationExpression_Situation()
   * @model required="true"
   * @generated
   */

  Situation getSituation();

  /**
   * Sets the value of the '{@link org.polarsys.capella.vp.ms.InSituationExpression#getSituation <em>Situation</em>}'
   * reference.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Situation</em>' reference.
   * @see #getSituation()
   * @generated
   */

  void setSituation(Situation value);

} // InSituationExpression
