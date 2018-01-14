grammar Api;

apidoc: (api | apiDescription | apiName | apiGroup
| apiParam)*;

api:API WS method WS path WS title NEWLINE ;
apiDescription : APIDESCRIPTION WS text NEWLINE;
//apiParam : APIPARAM WS '{' type '}' WS text NEWLINE;
//apiParam : APIPARAM WS text NEWLINE;
apiParam : APIPARAM WS method WS field  WS description NEWLINE;

apiName : APINAME WS name NEWLINE;
apiGroup:APIGROUP WS name NEWLINE;

//field WS description NEWLINE;

//apiParamLastPart :  field ' ' description NEWLINE;
method : '{' EN_CHAR+ '}';
path : PATH;
title : TEXT;
name : TEXT;
// text rule is commen.
text : TEXT;
//type : '{' TEXT '}';
field : EN_CHAR+;
description : TEXT;

//apiParamContent : TEXT;
//apiParamContent : TEXT;

/////////////////////////////////////////
//TITLE : CHINESE;
WS:[ \t]+;
//WS:[ ]+;
NEWLINE:[\r\n];

//WD:[a-zA-Z0-9_-];
//NOTE:'@'WD+;
//PATH:'/'WD+;
//PATH : [a-zA-Z_-] | '/';


PATH : ('/' | [a-zA-Z0-9_-])+;
TYPE :  [a-zA-Z.]+;
//FIELD : [a-zA-Z]+ ;

//CHINESE    : [\u4E00-\u9FCB]+;
TEXT : (EN_CHAR | CHINESE_CHAR)+;
TEXT_WITH_SPACE : TEXT (' ' TEXT)*;
CHINESE_CHAR : [\u4E00-\u9FCB];
EN_CHAR : [a-zA-Z0-9_-];


API:'@api';
APIPARAM : '@apiParam';
APIDEFINE:'@apiDefine';
APINAME:'@apiName';
APIGROUP:'@apiGroup';
APIDESCRIPTION:'@apiDescription';

//REQUEST_METHOD_NAME:'{GET}'| '{POST}' | '{DELETE}'| 'HEAD'|' TRACE'| 'OPTIONS'| 'CONNECT'| 'PATCH';

