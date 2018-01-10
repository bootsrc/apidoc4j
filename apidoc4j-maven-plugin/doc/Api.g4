grammar Api;

apidoc: field*;
field : api| apiName | apiGroup;

api:API WS '{' method '}' WS path WS title NEWLINE ;

apiName : APINAME WS name NEWLINE;
apiGroup:APIGROUP WS name NEWLINE;

method : REQUEST_METHOD_NAME;
path : EN_STRING;
title : TITLE;
name : EN_STRING;


/////////////////////////////////////////
TITLE : EN_STRING;
WS:[ \t]+;
//WS:[ ]+;
NEWLINE:[\r\n]+;


//WD:[a-zA-Z0-9_-];
//NOTE:'@'WD+;
//PATH:'/'WD+;
//PATH : [a-zA-Z_-] | '/';

EN_STRING : ('/' | [a-zA-Z0-9_-])+;
//STRING : ~[\s]* ;

API:'@api';
APIDEFINE:'@apiDefine';
APINAME:'@apiName';
APIGROUP:'@apiGroup';


REQUEST_METHOD_NAME:'GET'| 'POST' | 'DELETE'| 'HEAD'|' TRACE'| 'OPTIONS'| 'CONNECT'| 'PATCH';

