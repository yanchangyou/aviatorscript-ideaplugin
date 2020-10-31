// license.txt
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageCodes extends PsiElement {

  @NotNull
  List<MyLanguageStatement> getStatementList();

}
