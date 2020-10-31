package my.lang.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import lang.psi.MyLanguageTypes;
import org.jetbrains.annotations.NotNull;

/**
 * @author yanchangyou
 */
public class MyLanguageCompletionContributor extends CompletionContributor {

    public MyLanguageCompletionContributor() {

        extend(CompletionType.BASIC, PlatformPatterns.psiElement(MyLanguageTypes.MY_BOOLEAN),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    public void addCompletions(@NotNull CompletionParameters parameters,
                            @NotNull ProcessingContext context,
                            @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("true"));
                    }
                }
        );

    }

}

