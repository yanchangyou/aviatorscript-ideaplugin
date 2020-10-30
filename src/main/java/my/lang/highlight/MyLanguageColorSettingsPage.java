package my.lang.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import my.lang.icon.MyLanguageIcons;

import javax.swing.*;
import java.util.Map;

/**
 * @author yanchangyou
 */
public class MyLanguageColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {

            new AttributesDescriptor("LineComment", MyLanguageSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("BlockComment", MyLanguageSyntaxHighlighter.BLOCK_COMMENT),

            new AttributesDescriptor("Action", MyLanguageSyntaxHighlighter.ACTION),

            new AttributesDescriptor("String", MyLanguageSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", MyLanguageSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Boolean", MyLanguageSyntaxHighlighter.BOOLEAN),

            new AttributesDescriptor("Bad Value", MyLanguageSyntaxHighlighter.BAD_CHARACTER)

    };

    @Nullable
    @Override
    public Icon getIcon() {
        return MyLanguageIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new MyLanguageSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "// {listen|speak|read|write} content\n"
                + "/* content ::= string|number|boolean\n" +
                " boolean ::= true|false */\n"
                + "listen \"hello,world!\"\n"
                + "speak \"hello,world!\"\n"
                + "read \"hello,world!\"\n"
                + "write \"hello,world!\"\n"
                + "\n"
                + "speak 123.456E789\n"
                + "listen 123.456E789\n"
                + "read 123.456E789\n"
                + "write 123.456E789\n"
                + "\n"
                + "speak true\n"
                + "listen false\n"
                + "read true\n"
                + "write false\n"
                + "\n"
                + ""
                ;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "My";
    }
}
