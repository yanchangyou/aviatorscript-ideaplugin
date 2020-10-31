// license description
package lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import my.lang.psi.MyLanguageElementType;
import my.lang.psi.MyLanguageTokenType;
import my.lang.psi.impl.*;

public interface MyLanguageTypes {

  IElementType MY_BOOLEAN = new MyLanguageElementType("MY_BOOLEAN");
  IElementType MY_BREAK_STATEMENT = new MyLanguageElementType("MY_BREAK_STATEMENT");
  IElementType MY_CODES = new MyLanguageElementType("MY_CODES");
  IElementType MY_CONTINUE_STATEMENT = new MyLanguageElementType("MY_CONTINUE_STATEMENT");
  IElementType MY_EXPRESS = new MyLanguageElementType("MY_EXPRESS");
  IElementType MY_FN_DEFINE_STATEMENT = new MyLanguageElementType("MY_FN_DEFINE_STATEMENT");
  IElementType MY_FN_INVOKE_EXPRESS = new MyLanguageElementType("MY_FN_INVOKE_EXPRESS");
  IElementType MY_FN_INVOKE_STATEMENT = new MyLanguageElementType("MY_FN_INVOKE_STATEMENT");
  IElementType MY_FOR_STATEMENT = new MyLanguageElementType("MY_FOR_STATEMENT");
  IElementType MY_IF_STATEMENT = new MyLanguageElementType("MY_IF_STATEMENT");
  IElementType MY_LET_STATEMENT = new MyLanguageElementType("MY_LET_STATEMENT");
  IElementType MY_NEW_STATEMENT = new MyLanguageElementType("MY_NEW_STATEMENT");
  IElementType MY_REF_EXPRESS = new MyLanguageElementType("MY_REF_EXPRESS");
  IElementType MY_RELATION_EXPRESS = new MyLanguageElementType("MY_RELATION_EXPRESS");
  IElementType MY_RETURN_STATEMENT = new MyLanguageElementType("MY_RETURN_STATEMENT");
  IElementType MY_STATEMENT = new MyLanguageElementType("MY_STATEMENT");
  IElementType MY_THREE_EXPRESS = new MyLanguageElementType("MY_THREE_EXPRESS");
  IElementType MY_THREE_STATEMENT = new MyLanguageElementType("MY_THREE_STATEMENT");
  IElementType MY_THROW_STATEMENT = new MyLanguageElementType("MY_THROW_STATEMENT");
  IElementType MY_TRY_STATEMENT = new MyLanguageElementType("MY_TRY_STATEMENT");
  IElementType MY_VALUE = new MyLanguageElementType("MY_VALUE");
  IElementType MY_WHILE_STATEMENT = new MyLanguageElementType("MY_WHILE_STATEMENT");

  IElementType MY_AMP = new MyLanguageTokenType("AMP");
  IElementType MY_ANGLE_LEFT = new MyLanguageTokenType("ANGLE_LEFT");
  IElementType MY_ANGLE_RIGHT = new MyLanguageTokenType("ANGLE_RIGHT");
  IElementType MY_ASSIGN = new MyLanguageTokenType("=");
  IElementType MY_BAR = new MyLanguageTokenType("bar");
  IElementType MY_BIT_AND = new MyLanguageTokenType("&");
  IElementType MY_BIT_AND_ASSIGN = new MyLanguageTokenType("&=");
  IElementType MY_BIT_CLEAR = new MyLanguageTokenType("&^");
  IElementType MY_BIT_CLEAR_ASSIGN = new MyLanguageTokenType("&^=");
  IElementType MY_BIT_OR = new MyLanguageTokenType("|");
  IElementType MY_BIT_OR_ASSIGN = new MyLanguageTokenType("|=");
  IElementType MY_BIT_XOR = new MyLanguageTokenType("^");
  IElementType MY_BIT_XOR_ASSIGN = new MyLanguageTokenType("^=");
  IElementType MY_BRACE_LEFT = new MyLanguageTokenType("BRACE_LEFT");
  IElementType MY_BRACE_RIGHT = new MyLanguageTokenType("BRACE_RIGHT");
  IElementType MY_BRACK_LEFT = new MyLanguageTokenType("BRACK_LEFT");
  IElementType MY_BRACK_RIGHT = new MyLanguageTokenType("BRACK_RIGHT");
  IElementType MY_BREAK = new MyLanguageTokenType("break");
  IElementType MY_CATCH = new MyLanguageTokenType("catch");
  IElementType MY_COLON = new MyLanguageTokenType(":");
  IElementType MY_COMMA = new MyLanguageTokenType(",");
  IElementType MY_COND_AND = new MyLanguageTokenType("&&");
  IElementType MY_COND_OR = new MyLanguageTokenType("||");
  IElementType MY_CONTINUE = new MyLanguageTokenType("continue");
  IElementType MY_DASH = new MyLanguageTokenType("DASH");
  IElementType MY_DOLLAR = new MyLanguageTokenType("DOLLAR");
  IElementType MY_DOT = new MyLanguageTokenType(".");
  IElementType MY_ELSE = new MyLanguageTokenType("else");
  IElementType MY_ELSEIF = new MyLanguageTokenType("elseif");
  IElementType MY_EQ = new MyLanguageTokenType("==");
  IElementType MY_FALSE = new MyLanguageTokenType("FALSE");
  IElementType MY_FN = new MyLanguageTokenType("fn");
  IElementType MY_FOR = new MyLanguageTokenType("for");
  IElementType MY_FSLASH = new MyLanguageTokenType("FSLASH");
  IElementType MY_GREATER = new MyLanguageTokenType(">");
  IElementType MY_GREATER_OR_EQUAL = new MyLanguageTokenType(">=");
  IElementType MY_IDENTIFIER = new MyLanguageTokenType("identifier");
  IElementType MY_IF = new MyLanguageTokenType("if");
  IElementType MY_IN = new MyLanguageTokenType("in");
  IElementType MY_INT = new MyLanguageTokenType("int");
  IElementType MY_LBRACE = new MyLanguageTokenType("{");
  IElementType MY_LBRACK = new MyLanguageTokenType("[");
  IElementType MY_LESS = new MyLanguageTokenType("<");
  IElementType MY_LESS_OR_EQUAL = new MyLanguageTokenType("<=");
  IElementType MY_LET = new MyLanguageTokenType("let");
  IElementType MY_LINE_COMMENT = new MyLanguageTokenType("line_comment");
  IElementType MY_LPAREN = new MyLanguageTokenType("(");
  IElementType MY_MINUS = new MyLanguageTokenType("-");
  IElementType MY_MINUS_ASSIGN = new MyLanguageTokenType("-=");
  IElementType MY_MINUS_MINUS = new MyLanguageTokenType("--");
  IElementType MY_MUL = new MyLanguageTokenType("*");
  IElementType MY_MUL_ASSIGN = new MyLanguageTokenType("*=");
  IElementType MY_NEW = new MyLanguageTokenType("new");
  IElementType MY_NOT = new MyLanguageTokenType("!");
  IElementType MY_NOT_EQ = new MyLanguageTokenType("!=");
  IElementType MY_NULL = new MyLanguageTokenType("nil");
  IElementType MY_NUMBER = new MyLanguageTokenType("number");
  IElementType MY_PAREN_LEFT = new MyLanguageTokenType("PAREN_LEFT");
  IElementType MY_PAREN_RIGHT = new MyLanguageTokenType("PAREN_RIGHT");
  IElementType MY_PERCENT = new MyLanguageTokenType("PERCENT");
  IElementType MY_PLUS = new MyLanguageTokenType("+");
  IElementType MY_PLUS_ASSIGN = new MyLanguageTokenType("+=");
  IElementType MY_PLUS_PLUS = new MyLanguageTokenType("++");
  IElementType MY_QUESTION = new MyLanguageTokenType("QUESTION");
  IElementType MY_QUOTIENT = new MyLanguageTokenType("/");
  IElementType MY_QUOTIENT_ASSIGN = new MyLanguageTokenType("/=");
  IElementType MY_RAW_STRING = new MyLanguageTokenType("raw_string");
  IElementType MY_RBRACE = new MyLanguageTokenType("}");
  IElementType MY_RBRACK = new MyLanguageTokenType("]");
  IElementType MY_REMAINDER = new MyLanguageTokenType("%");
  IElementType MY_REMAINDER_ASSIGN = new MyLanguageTokenType("%=");
  IElementType MY_RETURN = new MyLanguageTokenType("return");
  IElementType MY_RPAREN = new MyLanguageTokenType(")");
  IElementType MY_SEMICOLON = new MyLanguageTokenType(";");
  IElementType MY_SEMICOLON_SYNTHETIC = new MyLanguageTokenType("<NL>");
  IElementType MY_SEND_CHANNEL = new MyLanguageTokenType("<-");
  IElementType MY_SHIFT_LEFT = new MyLanguageTokenType("<<");
  IElementType MY_SHIFT_LEFT_ASSIGN = new MyLanguageTokenType("<<=");
  IElementType MY_SHIFT_RIGHT = new MyLanguageTokenType(">>");
  IElementType MY_SHIFT_RIGHT_ASSIGN = new MyLanguageTokenType(">>=");
  IElementType MY_STRING = new MyLanguageTokenType("string");
  IElementType MY_THROW = new MyLanguageTokenType("throw");
  IElementType MY_TILDE = new MyLanguageTokenType("TILDE");
  IElementType MY_TRIPLE_DOT = new MyLanguageTokenType("...");
  IElementType MY_TRUE = new MyLanguageTokenType("TRUE");
  IElementType MY_TRY = new MyLanguageTokenType("try");
  IElementType MY_TYPE_ = new MyLanguageTokenType("type");
  IElementType MY_VAR_ASSIGN = new MyLanguageTokenType(":=");
  IElementType MY_WHILE = new MyLanguageTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MY_BOOLEAN) {
        return new MyLanguageBooleanImpl(node);
      }
      else if (type == MY_BREAK_STATEMENT) {
        return new MyLanguageBreakStatementImpl(node);
      }
      else if (type == MY_CODES) {
        return new MyLanguageCodesImpl(node);
      }
      else if (type == MY_CONTINUE_STATEMENT) {
        return new MyLanguageContinueStatementImpl(node);
      }
      else if (type == MY_EXPRESS) {
        return new MyLanguageExpressImpl(node);
      }
      else if (type == MY_FN_DEFINE_STATEMENT) {
        return new MyLanguageFnDefineStatementImpl(node);
      }
      else if (type == MY_FN_INVOKE_EXPRESS) {
        return new MyLanguageFnInvokeExpressImpl(node);
      }
      else if (type == MY_FN_INVOKE_STATEMENT) {
        return new MyLanguageFnInvokeStatementImpl(node);
      }
      else if (type == MY_FOR_STATEMENT) {
        return new MyLanguageForStatementImpl(node);
      }
      else if (type == MY_IF_STATEMENT) {
        return new MyLanguageIfStatementImpl(node);
      }
      else if (type == MY_LET_STATEMENT) {
        return new MyLanguageLetStatementImpl(node);
      }
      else if (type == MY_NEW_STATEMENT) {
        return new MyLanguageNewStatementImpl(node);
      }
      else if (type == MY_REF_EXPRESS) {
        return new MyLanguageRefExpressImpl(node);
      }
      else if (type == MY_RELATION_EXPRESS) {
        return new MyLanguageRelationExpressImpl(node);
      }
      else if (type == MY_RETURN_STATEMENT) {
        return new MyLanguageReturnStatementImpl(node);
      }
      else if (type == MY_STATEMENT) {
        return new MyLanguageStatementImpl(node);
      }
      else if (type == MY_THREE_EXPRESS) {
        return new MyLanguageThreeExpressImpl(node);
      }
      else if (type == MY_THREE_STATEMENT) {
        return new MyLanguageThreeStatementImpl(node);
      }
      else if (type == MY_THROW_STATEMENT) {
        return new MyLanguageThrowStatementImpl(node);
      }
      else if (type == MY_TRY_STATEMENT) {
        return new MyLanguageTryStatementImpl(node);
      }
      else if (type == MY_VALUE) {
        return new MyLanguageValueImpl(node);
      }
      else if (type == MY_WHILE_STATEMENT) {
        return new MyLanguageWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
