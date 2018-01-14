grammar Api;

apidoc : otherComment ( fieldExpr )* EOF;

otherComment :  multiText (ENTER+ multiText)* ENTER+;

fieldExpr : OP_AT fieldString ENTER*;

fieldString : fieldApi | fieldApiName | fieldApiParam | fieldApiParamExample | fieldApiSuccess | fieldApiVersion;

fieldApi :
    K_API SPACE+ OP_LBRACE method OP_RBRACE SPACE+ path  (SPACE+ title)? SPACE*;

fieldApiName :
    K_APINAME SPACE+ name SPACE*;

fieldApiParam :
    K_APIPARAM SPACE+ (OP_LPAREN group OP_RPAREN)? (OP_LBRACE type OP_RBRACE SPACE+)? field (SPACE+ description)? SPACE*;
fieldApiParamExample:
    K_APIPARAMEXAMPLE (SPACE+ OP_LBRACE type OP_RBRACE)? (SPACE+ paramTitle)? example;
//       K_APIPARAMEXAMPLE ALL_TEXT;
fieldApiSuccess :
    K_APISUCCESS SPACE+ (OP_LPAREN group OP_RPAREN)? (OP_LBRACE type OP_RBRACE SPACE+)? field (SPACE+ description)? SPACE*;
fieldApiVersion :
    K_APIVERSION SPACE+ version SPACE*;
name : STRING_UNICODE;
method : STRING_UNICODE;
//path : (OP_BACK_SLASH | STRING_UNICODE)+;
path : PATH_VALUE;
title : multiText;

// apiParam
group : STRING_UNICODE;
type : STRING_UNICODE;
field : STRING_UNICODE;
description : multiText;
// apiParamExample
//paramTitle : CHAR_JSON+;
//example :  ENTER CHAR_JSON+;
paramTitle : multiText;
example: ENTER+ multiText;

// apiVersion
version :  VERSION;

multiText : STRING_UNICODE (SPACE+ STRING_UNICODE)*;
/////////////////////////////////////////////////////////////////////////////

//CHAR_JSON : OP_LBRACE | OP_RBRACE |'"' | '\'' | CHAR_WITH_OP | SPACE | ENTER;


K_API :             'api';
K_APIPARAM :        'apiParam';
K_APIPARAMEXAMPLE:  'apiParamExample';
K_APIDEFINE :       'apiDefine';
K_APINAME :         'apiName';
K_APIGROUP :        'apiGroup';
K_APIDESCRIPTION :  'apiDescription';
K_APISUCCESS :      'apiSuccess';
K_APIVERSION :      'apiVersion';

//PARAM_EXAMPLE : OP_LBRACE .*? OP_RBRACE;
//TEXT_WITH_SPECIAL_CHAR : COMMON_AND_SPECIAL_CHAR+;
STRING_UNICODE : CHAR_UNICODE+;
PATH_VALUE : (OP_BACK_SLASH | STRING_UNICODE)+;
VERSION : CHAR_UNICODE_AND_DOT+;

fragment
CHAR_WITH_OP : [-_: .0-9a-zA-Z\u4E00-\u9FCB];
fragment
CHAR_UNICODE_AND_DOT : [.0-9a-zA-Z\u4E00-\u9FCB];
fragment
CHAR_UNICODE : [0-9a-zA-Z\u4E00-\u9FCB];
//fragment
//COMMON_AND_SPECIAL_CHAR : [\-_:.0-9a-zA-Z\u4E00-\u9FCB];
//COMMON_AND_SPECIAL_CHAR : CHAR_UNICODE_AND_DOT '-' | '_' | ':' | ;

// Operator keywords OP_XXX
OP_LPAREN:             '(';
OP_RPAREN:             ')';
//fragment
OP_LBRACE:             '{';
//fragment
OP_RBRACE:             '}';
OP_LBRACK:             '[';
OP_RBRACK:             ']';
OP_BACK_SLASH :        '/';
OP_AT : '@';

SPACE : ' ';
ENTER : '\n';
DOT : '.';
