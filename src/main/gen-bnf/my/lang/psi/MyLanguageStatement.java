// This is a generated file. Not intended for manual editing.
package my.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface MyLanguageStatement extends MyLanguageActionElement {

  @Nullable
  MyLanguageContent getContent();

  @Nullable
  PsiElement getAction();

  @Nullable
  PsiElement getBlockComment();

  @Nullable
  PsiElement getLineComment();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
