/*
 * Copyright 2020-2020 yanchangyou
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.

package lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import my.lang.psi.MyLanguageElementType;
import my.lang.psi.MyLanguageTokenType;
import my.lang.psi.impl.*;

public interface MyLanguageTypes {

  IElementType MY_ALL_EXPRESS = new MyLanguageElementType("MY_ALL_EXPRESS");
  IElementType MY_ALL_EXPRESS_STATEMENT = new MyLanguageElementType("MY_ALL_EXPRESS_STATEMENT");
  IElementType MY_ASSIGN_EXPRESS = new MyLanguageElementType("MY_ASSIGN_EXPRESS");
  IElementType MY_ASSIGN_STATEMENT = new MyLanguageElementType("MY_ASSIGN_STATEMENT");
  IElementType MY_BOOLEAN = new MyLanguageElementType("MY_BOOLEAN");
  IElementType MY_BREAK_STATEMENT = new MyLanguageElementType("MY_BREAK_STATEMENT");
  IElementType MY_CODES = new MyLanguageElementType("MY_CODES");
  IElementType MY_CONTINUE_STATEMENT = new MyLanguageElementType("MY_CONTINUE_STATEMENT");
  IElementType MY_EXPRESS = new MyLanguageElementType("MY_EXPRESS");
  IElementType MY_FN_DEFINE_STATEMENT = new MyLanguageElementType("MY_FN_DEFINE_STATEMENT");
  IElementType MY_FN_INVOKE_EXPRESS = new MyLanguageElementType("MY_FN_INVOKE_EXPRESS");
  IElementType MY_FN_INVOKE_STATEMENT = new MyLanguageElementType("MY_FN_INVOKE_STATEMENT");
  IElementType MY_FN_PARAM = new MyLanguageElementType("MY_FN_PARAM");
  IElementType MY_FOR_STATEMENT = new MyLanguageElementType("MY_FOR_STATEMENT");
  IElementType MY_IF_STATEMENT = new MyLanguageElementType("MY_IF_STATEMENT");
  IElementType MY_LAMBDA_EXPRESS = new MyLanguageElementType("MY_LAMBDA_EXPRESS");
  IElementType MY_LAMBDA_STATEMENT = new MyLanguageElementType("MY_LAMBDA_STATEMENT");
  IElementType MY_LET_STATEMENT = new MyLanguageElementType("MY_LET_STATEMENT");
  IElementType MY_NEW_STATEMENT = new MyLanguageElementType("MY_NEW_STATEMENT");
  IElementType MY_OP = new MyLanguageElementType("MY_OP");
  IElementType MY_OP_EXPRESS = new MyLanguageElementType("MY_OP_EXPRESS");
  IElementType MY_REF_EXPRESS = new MyLanguageElementType("MY_REF_EXPRESS");
  IElementType MY_RETURN_STATEMENT = new MyLanguageElementType("MY_RETURN_STATEMENT");
  IElementType MY_STATEMENT = new MyLanguageElementType("MY_STATEMENT");
  IElementType MY_SUB_ALL_EXPRESS = new MyLanguageElementType("MY_SUB_ALL_EXPRESS");
  IElementType MY_THREE_EXPRESS = new MyLanguageElementType("MY_THREE_EXPRESS");
  IElementType MY_THREE_STATEMENT = new MyLanguageElementType("MY_THREE_STATEMENT");
  IElementType MY_THROW_STATEMENT = new MyLanguageElementType("MY_THROW_STATEMENT");
  IElementType MY_TRY_STATEMENT = new MyLanguageElementType("MY_TRY_STATEMENT");
  IElementType MY_TYPE_REF = new MyLanguageElementType("MY_TYPE_REF");
  IElementType MY_USE_EXPRESS = new MyLanguageElementType("MY_USE_EXPRESS");
  IElementType MY_USE_STATEMENT = new MyLanguageElementType("MY_USE_STATEMENT");
  IElementType MY_VALUE = new MyLanguageElementType("MY_VALUE");
  IElementType MY_WHILE_STATEMENT = new MyLanguageElementType("MY_WHILE_STATEMENT");

  IElementType MY_ASSIGN = new MyLanguageTokenType("=");
  IElementType MY_BIT_AND = new MyLanguageTokenType("&");
  IElementType MY_BIT_AND_ASSIGN = new MyLanguageTokenType("&=");
  IElementType MY_BIT_CLEAR = new MyLanguageTokenType("&^");
  IElementType MY_BIT_CLEAR_ASSIGN = new MyLanguageTokenType("&^=");
  IElementType MY_BIT_OR = new MyLanguageTokenType("|");
  IElementType MY_BIT_OR_ASSIGN = new MyLanguageTokenType("|=");
  IElementType MY_BIT_TILDE = new MyLanguageTokenType("&~");
  IElementType MY_BIT_XOR = new MyLanguageTokenType("^");
  IElementType MY_BIT_XOR_ASSIGN = new MyLanguageTokenType("^=");
  IElementType MY_BRACE_LEFT = new MyLanguageTokenType("{");
  IElementType MY_BRACE_RIGHT = new MyLanguageTokenType("}");
  IElementType MY_BRACK_LEFT = new MyLanguageTokenType("[");
  IElementType MY_BRACK_RIGHT = new MyLanguageTokenType("]");
  IElementType MY_BREAK = new MyLanguageTokenType("break");
  IElementType MY_CATCH = new MyLanguageTokenType("catch");
  IElementType MY_COLON = new MyLanguageTokenType(":");
  IElementType MY_COMMA = new MyLanguageTokenType(",");
  IElementType MY_COND_AND = new MyLanguageTokenType("&&");
  IElementType MY_COND_OR = new MyLanguageTokenType("||");
  IElementType MY_CONTINUE = new MyLanguageTokenType("continue");
  IElementType MY_DOT = new MyLanguageTokenType(".");
  IElementType MY_ELSE = new MyLanguageTokenType("else");
  IElementType MY_ELSIF = new MyLanguageTokenType("elsif");
  IElementType MY_END = new MyLanguageTokenType("end");
  IElementType MY_EQ = new MyLanguageTokenType("==");
  IElementType MY_EQ_TILDE = new MyLanguageTokenType("=~");
  IElementType MY_FALSE = new MyLanguageTokenType("FALSE");
  IElementType MY_FINALLY = new MyLanguageTokenType("finally");
  IElementType MY_FN = new MyLanguageTokenType("fn");
  IElementType MY_FOR = new MyLanguageTokenType("for");
  IElementType MY_GREATER = new MyLanguageTokenType(">");
  IElementType MY_GREATER_OR_EQUAL = new MyLanguageTokenType(">=");
  IElementType MY_IDENTIFIER = new MyLanguageTokenType("identifier");
  IElementType MY_IF = new MyLanguageTokenType("if");
  IElementType MY_IN = new MyLanguageTokenType("in");
  IElementType MY_INT = new MyLanguageTokenType("int");
  IElementType MY_LAMBDA = new MyLanguageTokenType("lambda");
  IElementType MY_LAMBDA_TARGET = new MyLanguageTokenType("->");
  IElementType MY_LESS = new MyLanguageTokenType("<");
  IElementType MY_LESS_OR_EQUAL = new MyLanguageTokenType("<=");
  IElementType MY_LET = new MyLanguageTokenType("let");
  IElementType MY_LINE_COMMENT = new MyLanguageTokenType("line_comment");
  IElementType MY_MINUS = new MyLanguageTokenType("-");
  IElementType MY_MINUS_ASSIGN = new MyLanguageTokenType("-=");
  IElementType MY_MINUS_MINUS = new MyLanguageTokenType("--");
  IElementType MY_MUL = new MyLanguageTokenType("*");
  IElementType MY_MUL_ASSIGN = new MyLanguageTokenType("*=");
  IElementType MY_NEW = new MyLanguageTokenType("new");
  IElementType MY_NOT = new MyLanguageTokenType("not");
  IElementType MY_NOT_EQ = new MyLanguageTokenType("!=");
  IElementType MY_NULL = new MyLanguageTokenType("nil");
  IElementType MY_NUMBER = new MyLanguageTokenType("number");
  IElementType MY_PARAMREF = new MyLanguageTokenType("paramRef");
  IElementType MY_PAREN_LEFT = new MyLanguageTokenType("(");
  IElementType MY_PAREN_RIGHT = new MyLanguageTokenType(")");
  IElementType MY_PLUS = new MyLanguageTokenType("+");
  IElementType MY_PLUS_ASSIGN = new MyLanguageTokenType("+=");
  IElementType MY_PLUS_PLUS = new MyLanguageTokenType("++");
  IElementType MY_QUESTION = new MyLanguageTokenType("?");
  IElementType MY_QUOTIENT = new MyLanguageTokenType("/");
  IElementType MY_QUOTIENT_ASSIGN = new MyLanguageTokenType("/=");
  IElementType MY_RAW_STRING = new MyLanguageTokenType("raw_string");
  IElementType MY_REGSTATEMENT = new MyLanguageTokenType("regStatement");
  IElementType MY_REMAINDER = new MyLanguageTokenType("%");
  IElementType MY_REMAINDER_ASSIGN = new MyLanguageTokenType("%=");
  IElementType MY_RETURN = new MyLanguageTokenType("return");
  IElementType MY_SEMICOLON = new MyLanguageTokenType(";");
  IElementType MY_SEMICOLON_SYNTHETIC = new MyLanguageTokenType("<NL>");
  IElementType MY_SEND_CHANNEL = new MyLanguageTokenType("<-");
  IElementType MY_SHIFT_LEFT = new MyLanguageTokenType("<<");
  IElementType MY_SHIFT_LEFT_ASSIGN = new MyLanguageTokenType("<<=");
  IElementType MY_SHIFT_RIGHT = new MyLanguageTokenType(">>");
  IElementType MY_SHIFT_RIGHT_ASSIGN = new MyLanguageTokenType(">>=");
  IElementType MY_STRING = new MyLanguageTokenType("string");
  IElementType MY_THROW = new MyLanguageTokenType("throw");
  IElementType MY_TRIPLE_DOT = new MyLanguageTokenType("...");
  IElementType MY_TRUE = new MyLanguageTokenType("TRUE");
  IElementType MY_TRY = new MyLanguageTokenType("try");
  IElementType MY_USE = new MyLanguageTokenType("use");
  IElementType MY_VAR_ASSIGN = new MyLanguageTokenType(":=");
  IElementType MY_WHILE = new MyLanguageTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MY_ALL_EXPRESS) {
        return new MyLanguageAllExpressImpl(node);
      }
      else if (type == MY_ALL_EXPRESS_STATEMENT) {
        return new MyLanguageAllExpressStatementImpl(node);
      }
      else if (type == MY_ASSIGN_EXPRESS) {
        return new MyLanguageAssignExpressImpl(node);
      }
      else if (type == MY_ASSIGN_STATEMENT) {
        return new MyLanguageAssignStatementImpl(node);
      }
      else if (type == MY_BOOLEAN) {
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
      else if (type == MY_FN_PARAM) {
        return new MyLanguageFnParamImpl(node);
      }
      else if (type == MY_FOR_STATEMENT) {
        return new MyLanguageForStatementImpl(node);
      }
      else if (type == MY_IF_STATEMENT) {
        return new MyLanguageIfStatementImpl(node);
      }
      else if (type == MY_LAMBDA_EXPRESS) {
        return new MyLanguageLambdaExpressImpl(node);
      }
      else if (type == MY_LAMBDA_STATEMENT) {
        return new MyLanguageLambdaStatementImpl(node);
      }
      else if (type == MY_LET_STATEMENT) {
        return new MyLanguageLetStatementImpl(node);
      }
      else if (type == MY_NEW_STATEMENT) {
        return new MyLanguageNewStatementImpl(node);
      }
      else if (type == MY_OP) {
        return new MyLanguageOpImpl(node);
      }
      else if (type == MY_OP_EXPRESS) {
        return new MyLanguageOpExpressImpl(node);
      }
      else if (type == MY_REF_EXPRESS) {
        return new MyLanguageRefExpressImpl(node);
      }
      else if (type == MY_RETURN_STATEMENT) {
        return new MyLanguageReturnStatementImpl(node);
      }
      else if (type == MY_STATEMENT) {
        return new MyLanguageStatementImpl(node);
      }
      else if (type == MY_SUB_ALL_EXPRESS) {
        return new MyLanguageSubAllExpressImpl(node);
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
      else if (type == MY_TYPE_REF) {
        return new MyLanguageTypeRefImpl(node);
      }
      else if (type == MY_USE_EXPRESS) {
        return new MyLanguageUseExpressImpl(node);
      }
      else if (type == MY_USE_STATEMENT) {
        return new MyLanguageUseStatementImpl(node);
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
