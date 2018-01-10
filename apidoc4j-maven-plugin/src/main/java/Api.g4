grammar Api;

apidoc: (api | apiName | apiGroup)*;

api:API WS '{' method '}' WS path WS title NEWLINE ;

apiName : APINAME WS name NEWLINE;
apiGroup:APIGROUP WS name NEWLINE;

method : REQUEST_METHOD_NAME;
path : PATH;
title : TEXT;
name : TEXT;


/////////////////////////////////////////
//TITLE : CHINESE;
WS:[ \t]+;
//WS:[ ]+;
NEWLINE:[\r\n]+;


//WD:[a-zA-Z0-9_-];
//NOTE:'@'WD+;
//PATH:'/'WD+;
//PATH : [a-zA-Z_-] | '/';

PATH : ('/' | [a-zA-Z0-9_-])+;
//STRING : ('/' | [a-zA-Z0-9_-])+;

//CHINESE    : [\u4E00-\u9FCB]+;
TEXT : (EN_CHAR | CHINESE_CHAR)+;
TEXT_WITH_SPACE : TEXT (' ' TEXT)*;
CHINESE_CHAR : [\u4E00-\u9FCB];
EN_CHAR : [a-zA-Z0-9_-];

XXX: '\u2070'..'\u218F';
//     ..'\u7E7E';

API:'@api';
APIDEFINE:'@apiDefine';
APINAME:'@apiName';
APIGROUP:'@apiGroup';


REQUEST_METHOD_NAME:'GET'| 'POST' | 'DELETE'| 'HEAD'|' TRACE'| 'OPTIONS'| 'CONNECT'| 'PATCH';

