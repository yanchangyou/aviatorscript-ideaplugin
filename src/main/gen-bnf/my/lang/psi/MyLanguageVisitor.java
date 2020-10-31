/*
 * Copyright 2020-2020 yanchangyou
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.

package my.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MyLanguageVisitor<R> extends PsiElementVisitor {

  public R visitAllExpress(@NotNull MyLanguageAllExpress o) {
    return visitPsiElement(o);
  }

  public R visitBoolean(@NotNull MyLanguageBoolean o) {
    return visitPsiElement(o);
  }

  public R visitBreakStatement(@NotNull MyLanguageBreakStatement o) {
    return visitPsiElement(o);
  }

  public R visitCodes(@NotNull MyLanguageCodes o) {
    return visitPsiElement(o);
  }

  public R visitContinueStatement(@NotNull MyLanguageContinueStatement o) {
    return visitPsiElement(o);
  }

  public R visitExpress(@NotNull MyLanguageExpress o) {
    return visitPsiElement(o);
  }

  public R visitFnDefineStatement(@NotNull MyLanguageFnDefineStatement o) {
    return visitPsiElement(o);
  }

  public R visitFnInvokeExpress(@NotNull MyLanguageFnInvokeExpress o) {
    return visitPsiElement(o);
  }

  public R visitFnInvokeStatement(@NotNull MyLanguageFnInvokeStatement o) {
    return visitPsiElement(o);
  }

  public R visitForStatement(@NotNull MyLanguageForStatement o) {
    return visitPsiElement(o);
  }

  public R visitIfStatement(@NotNull MyLanguageIfStatement o) {
    return visitPsiElement(o);
  }

  public R visitLambdaExpress(@NotNull MyLanguageLambdaExpress o) {
    return visitPsiElement(o);
  }

  public R visitLetStatement(@NotNull MyLanguageLetStatement o) {
    return visitPsiElement(o);
  }

  public R visitNewStatement(@NotNull MyLanguageNewStatement o) {
    return visitPsiElement(o);
  }

  public R visitOp(@NotNull MyLanguageOp o) {
    return visitPsiElement(o);
  }

  public R visitOpExpress(@NotNull MyLanguageOpExpress o) {
    return visitPsiElement(o);
  }

  public R visitRefExpress(@NotNull MyLanguageRefExpress o) {
    return visitPsiElement(o);
  }

  public R visitReturnStatement(@NotNull MyLanguageReturnStatement o) {
    return visitPsiElement(o);
  }

  public R visitStatement(@NotNull MyLanguageStatement o) {
    return visitStatementElement(o);
  }

  public R visitThreeExpress(@NotNull MyLanguageThreeExpress o) {
    return visitPsiElement(o);
  }

  public R visitThreeStatement(@NotNull MyLanguageThreeStatement o) {
    return visitPsiElement(o);
  }

  public R visitThrowStatement(@NotNull MyLanguageThrowStatement o) {
    return visitPsiElement(o);
  }

  public R visitTryStatement(@NotNull MyLanguageTryStatement o) {
    return visitPsiElement(o);
  }

  public R visitValue(@NotNull MyLanguageValue o) {
    return visitPsiElement(o);
  }

  public R visitWhileStatement(@NotNull MyLanguageWhileStatement o) {
    return visitPsiElement(o);
  }

  public R visitStatementElement(@NotNull MyLanguageStatementElement o) {
    return visitPsiElement(o);
  }

  public R visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
    return null;
  }

}
