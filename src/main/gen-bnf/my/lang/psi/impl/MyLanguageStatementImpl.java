// This is a generated file. Not intended for manual editing.
package my.lang.psi.impl;

import my.lang.psi.MyLanguageContent;
import my.lang.psi.MyLanguagePsiImplUtil;
import my.lang.psi.MyLanguageStatement;
import my.lang.psi.MyLanguageVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static lang.psi.MyLanguageTypes.*;
import my.lang.psi.*;
import com.intellij.navigation.ItemPresentation;

public class MyLanguageStatementImpl extends MyLanguageCodeElementImpl implements MyLanguageStatement {

  public MyLanguageStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MyLanguageVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MyLanguageContent getContent() {
    return findChildByClass(MyLanguageContent.class);
  }

  @Override
  @Nullable
  public PsiElement getAction() {
    return findChildByType(MY_ACTION);
  }

  @Override
  @Nullable
  public PsiElement getBlockComment() {
    return findChildByType(MY_BLOCK_COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getLineComment() {
    return findChildByType(MY_LINE_COMMENT);
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
