// This is a generated file. Not intended for manual editing.
package lang.psi;

import my.lang.psi.impl.MyLanguageContentImpl;
import my.lang.psi.impl.MyLanguageStatementImpl;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import my.lang.psi.MyLanguageElementType;
import my.lang.psi.MyLanguageTokenType;

public interface MyLanguageTypes {

  IElementType MY_CONTENT = new MyLanguageElementType("MY_CONTENT");
  IElementType MY_STATEMENT = new MyLanguageElementType("MY_STATEMENT");

  IElementType MY_ACTION = new MyLanguageTokenType("action");
  IElementType MY_BLOCK_COMMENT = new MyLanguageTokenType("block_comment");
  IElementType MY_BOOLEAN = new MyLanguageTokenType("boolean");
  IElementType MY_LINE_COMMENT = new MyLanguageTokenType("line_comment");
  IElementType MY_NUMBER = new MyLanguageTokenType("number");
  IElementType MY_STRING = new MyLanguageTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MY_CONTENT) {
        return new MyLanguageContentImpl(node);
      }
      else if (type == MY_STATEMENT) {
        return new MyLanguageStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
