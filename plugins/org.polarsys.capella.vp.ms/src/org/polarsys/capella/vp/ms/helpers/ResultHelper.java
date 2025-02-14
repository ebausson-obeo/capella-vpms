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
package org.polarsys.capella.vp.ms.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.vp.ms.Result;

/**
 * @generated
 */
public class ResultHelper {

  private static final ResultHelper instance = new ResultHelper();

  /**
   * @generated
   */
  public static ResultHelper getInstance() {
    return instance;
  }

  /**
   * @generated
   */
  public Object doSwitch(Result object, EStructuralFeature feature) {
    // handle derivated feature

    // delegate to parent helper
    return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
        .doSwitch(object, feature);

  }

}