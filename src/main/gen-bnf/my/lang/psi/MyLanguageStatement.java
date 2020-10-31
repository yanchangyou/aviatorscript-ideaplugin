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

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface MyLanguageStatement extends MyLanguageStatementElement {

  @Nullable
  MyLanguageAllExpressStatement getAllExpressStatement();

  @Nullable
  MyLanguageAssignStatement getAssignStatement();

  @Nullable
  MyLanguageBreakStatement getBreakStatement();

  @Nullable
  MyLanguageContinueStatement getContinueStatement();

  @Nullable
  MyLanguageFnDefineStatement getFnDefineStatement();

  @Nullable
  MyLanguageFnInvokeStatement getFnInvokeStatement();

  @Nullable
  MyLanguageForStatement getForStatement();

  @Nullable
  MyLanguageIfStatement getIfStatement();

  @Nullable
  MyLanguageLambdaStatement getLambdaStatement();

  @Nullable
  MyLanguageLetStatement getLetStatement();

  @Nullable
  MyLanguageNewStatement getNewStatement();

  @Nullable
  MyLanguageReturnStatement getReturnStatement();

  @NotNull
  List<MyLanguageStatement> getStatementList();

  @Nullable
  MyLanguageThreeStatement getThreeStatement();

  @Nullable
  MyLanguageThrowStatement getThrowStatement();

  @Nullable
  MyLanguageTryStatement getTryStatement();

  @Nullable
  MyLanguageWhileStatement getWhileStatement();

  @Nullable
  PsiElement getLineComment();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
