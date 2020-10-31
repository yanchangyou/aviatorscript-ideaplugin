// license.txt
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface MyLanguageStatement extends MyLanguageActionElement {

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
  MyLanguageLetStatement getLetStatement();

  @Nullable
  MyLanguageNewStatement getNewStatement();

  @Nullable
  MyLanguageReturnStatement getReturnStatement();

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
