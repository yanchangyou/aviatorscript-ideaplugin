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

package my.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.psi.MyLanguageTypes.*;
import my.lang.psi.*;
import com.intellij.navigation.ItemPresentation;

public class MyLanguageStatementImpl extends MyLanguageCodeElementImpl implements MyLanguageStatement {

  public MyLanguageStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MyLanguageAllExpressStatement getAllExpressStatement() {
    return findChildByClass(MyLanguageAllExpressStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageAssignStatement getAssignStatement() {
    return findChildByClass(MyLanguageAssignStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageBreakStatement getBreakStatement() {
    return findChildByClass(MyLanguageBreakStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageContinueStatement getContinueStatement() {
    return findChildByClass(MyLanguageContinueStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageFnDefineStatement getFnDefineStatement() {
    return findChildByClass(MyLanguageFnDefineStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageFnInvokeStatement getFnInvokeStatement() {
    return findChildByClass(MyLanguageFnInvokeStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageForStatement getForStatement() {
    return findChildByClass(MyLanguageForStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageIfStatement getIfStatement() {
    return findChildByClass(MyLanguageIfStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageLambdaStatement getLambdaStatement() {
    return findChildByClass(MyLanguageLambdaStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageLetStatement getLetStatement() {
    return findChildByClass(MyLanguageLetStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageNewStatement getNewStatement() {
    return findChildByClass(MyLanguageNewStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageReturnStatement getReturnStatement() {
    return findChildByClass(MyLanguageReturnStatement.class);
  }

  @Override
  @NotNull
  public List<MyLanguageStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MyLanguageStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageThreeStatement getThreeStatement() {
    return findChildByClass(MyLanguageThreeStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageThrowStatement getThrowStatement() {
    return findChildByClass(MyLanguageThrowStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageTryStatement getTryStatement() {
    return findChildByClass(MyLanguageTryStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageWhileStatement getWhileStatement() {
    return findChildByClass(MyLanguageWhileStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getLineComment() {
    return findChildByType(MY_LINE_COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getRegStatement() {
    return findChildByType(MY_REGSTATEMENT);
  }

  @Override
  public String getName() {
    return MyLanguagePsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return MyLanguagePsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return MyLanguagePsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return MyLanguagePsiImplUtil.getPresentation(this);
  }

}
