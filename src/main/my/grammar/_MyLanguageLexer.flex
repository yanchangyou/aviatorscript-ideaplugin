package av.lang.parser;

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

ACTION=(listen|speak|read|write)
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=([0-9]+(\.[0-9]+)?([Ee][0-9]+)?)
BOOLEAN=(true|false)
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\r\n|\r|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }


  {ACTION}             { return MY_ACTION; }
  {STRING}             { return MY_STRING; }
  {NUMBER}             { return MY_NUMBER; }
  {BOOLEAN}            { return MY_BOOLEAN; }
  {LINE_COMMENT}       { return MY_LINE_COMMENT; }
  {BLOCK_COMMENT}      { return MY_BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
