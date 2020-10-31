// license description
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageFnInvokeExpress extends PsiElement {

  @NotNull
  MyLanguageRefExpress getRefExpress();

  @Nullable
  MyLanguageRelationExpress getRelationExpress();

}
