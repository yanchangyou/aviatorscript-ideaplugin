// This is a generated file. Not intended for manual editing.
package my.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MyLanguageVisitor extends PsiElementVisitor {

  public void visitContent(@NotNull MyLanguageContent o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull MyLanguageStatement o) {
    visitActionElement(o);
  }

  public void visitActionElement(@NotNull MyLanguageActionElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
