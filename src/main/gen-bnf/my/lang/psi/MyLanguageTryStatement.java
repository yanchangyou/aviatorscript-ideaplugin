// license description
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageTryStatement extends PsiElement {

  @NotNull
  List<MyLanguageCodes> getCodesList();

  @NotNull
  MyLanguageExpress getExpress();

}
