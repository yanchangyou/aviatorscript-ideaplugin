// license description
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageValue extends PsiElement {

  @Nullable
  MyLanguageBoolean getBoolean();

  @Nullable
  PsiElement getNumber();

  @Nullable
  PsiElement getString();

}
