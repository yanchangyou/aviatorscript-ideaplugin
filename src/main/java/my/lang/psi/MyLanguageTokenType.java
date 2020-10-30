package my.lang.psi;

import com.intellij.psi.tree.IElementType;
import my.lang.MyLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author yanchangyou
 */
public class MyLanguageTokenType extends IElementType {

    public MyLanguageTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MyLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MyLanguageTokenType." + super.toString();
    }

}
