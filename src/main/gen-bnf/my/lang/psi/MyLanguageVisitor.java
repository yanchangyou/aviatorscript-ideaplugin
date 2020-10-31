// license.txt
package my.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MyLanguageVisitor<R> extends PsiElementVisitor {

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

  public R visitLetStatement(@NotNull MyLanguageLetStatement o) {
    return visitPsiElement(o);
  }

  public R visitNewStatement(@NotNull MyLanguageNewStatement o) {
    return visitPsiElement(o);
  }

  public R visitRefExpress(@NotNull MyLanguageRefExpress o) {
    return visitPsiElement(o);
  }

  public R visitRelationExpress(@NotNull MyLanguageRelationExpress o) {
    return visitPsiElement(o);
  }

  public R visitReturnStatement(@NotNull MyLanguageReturnStatement o) {
    return visitPsiElement(o);
  }

  public R visitStatement(@NotNull MyLanguageStatement o) {
    return visitActionElement(o);
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

  public R visitActionElement(@NotNull MyLanguageActionElement o) {
    return visitPsiElement(o);
  }

  public R visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
    return null;
  }

}
