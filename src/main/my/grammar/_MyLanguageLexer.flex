package my.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static lang.psi.MyLanguageTypes.*;

%%

%{
  public _MyLanguageLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MyLanguageLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

ID=[a-zA-Z_0-9]+
LINE_COMMENT=##.*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=[+-]?(0[xX][0-9a-fA-F]+|[1-9][0-9]*N?M?|[0-9]+(\.[0-9]+)?([Ee][+-]?[0-9]+)?M?)

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "("                 { return MY_PAREN_LEFT; }
  ")"                 { return MY_PAREN_RIGHT; }
  "["                 { return MY_BRACK_LEFT; }
  "]"                 { return MY_BRACK_RIGHT; }
  "{"                 { return MY_BRACE_LEFT; }
  "}"                 { return MY_BRACE_RIGHT; }
  "<"                 { return MY_ANGLE_LEFT; }
  ">"                 { return MY_ANGLE_RIGHT; }
  "="                 { return MY_EQ; }
  "-"                 { return MY_DASH; }
  "+"                 { return MY_PLUS; }
  "*"                 { return MY_MUL; }
  "/"                 { return MY_FSLASH; }
  "%"                 { return MY_PERCENT; }
  "&"                 { return MY_AMP; }
  "|"                 { return MY_BAR; }
  "!"                 { return MY_BANG; }
  ","                 { return MY_COMMA; }
  "."                 { return MY_DOT; }
  ";"                 { return MY_SEMICOLON; }
  "?"                 { return MY_QUESTION; }
  "$"                 { return MY_DOLLAR; }
  ":"                 { return MY_COLON; }
  "~"                 { return MY_TILDE; }
  "nil"               { return MY_NULL; }
  "TRUE"              { return MY_TRUE; }
  "FALSE"             { return MY_FALSE; }
  "while"             { return MY_WHILE; }
  "try"               { return MY_TRY; }
  "throw"             { return MY_THROW; }
  "return"            { return MY_RETURN; }
  "new"               { return MY_NEW; }
  "let"               { return MY_LET; }
  "int"               { return MY_INT; }
  "in"                { return MY_IN; }
  "if"                { return MY_IF; }
  "for"               { return MY_FOR; }
  "fn"                { return MY_FN; }
  "break"             { return MY_BREAK; }
  "continue"          { return MY_CONTINUE; }
  "elseif"            { return MY_ELSEIF; }
  "else"              { return MY_ELSE; }
  "catch"             { return MY_CATCH; }

  {ID}                { return MY_ID; }
  {LINE_COMMENT}      { return MY_LINE_COMMENT; }
  {STRING}            { return MY_STRING; }
  {NUMBER}            { return MY_NUMBER; }

}

[^] { return BAD_CHARACTER; }
