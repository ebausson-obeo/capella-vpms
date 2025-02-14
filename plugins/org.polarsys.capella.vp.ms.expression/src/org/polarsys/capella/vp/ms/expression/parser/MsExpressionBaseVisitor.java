/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
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
// Generated from grammar/MsExpression.g4 by ANTLR 4.7.2
package org.polarsys.capella.vp.ms.expression.parser;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link MsExpressionVisitor}, which can be extended to create a visitor
 * which only needs to handle a subset of the available methods.
 *
 * @param <T>
 *          The return type of the visit operation. Use {@link Void} for operations with no return type.
 */
public class MsExpressionBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MsExpressionVisitor<T> {
  /**
   * {@inheritDoc}
   *
   * <p>
   * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
   * </p>
   */
  @Override
  public T visitOrExpr(MsExpressionParser.OrExprContext ctx) {
    return visitChildren(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>
   * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
   * </p>
   */
  @Override
  public T visitAndExpr(MsExpressionParser.AndExprContext ctx) {
    return visitChildren(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>
   * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
   * </p>
   */
  @Override
  public T visitNotExpr(MsExpressionParser.NotExprContext ctx) {
    return visitChildren(ctx);
  }

  /**
   * {@inheritDoc}
   *
   * <p>
   * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
   * </p>
   */
  @Override
  public T visitHref(MsExpressionParser.HrefContext ctx) {
    return visitChildren(ctx);
  }
}