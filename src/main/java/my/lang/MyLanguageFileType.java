package my.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import my.lang.icon.MyLanguageIcons;

import javax.swing.*;

/**
 * @author yanchangyou
 */
public class MyLanguageFileType extends LanguageFileType {

    public static final MyLanguageFileType INSTANCE = new MyLanguageFileType();

    private MyLanguageFileType() {
        super(MyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "my";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "My language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "my";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MyLanguageIcons.FILE;
    }

}
