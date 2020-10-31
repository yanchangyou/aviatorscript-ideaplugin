// license description
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageWhileStatement extends PsiElement {

  @NotNull
  MyLanguageCodes getCodes();

  @NotNull
  MyLanguageExpress getExpress();

}
