grammar Hello;

root :  (field)* ;

field : api | apiParam | apiSuccess | apiExample;

api : Api apiValue ;
//path title;
//api : METHOD PATH TITLE;
//api: Api TEXT;
apiParam : ApiParam TEXT;
apiSuccess : ApiSuccess TEXT;
apiExample : ApiExample TEXT;


apiValue : method pathvalue;


method : METHOD ;
pathvalue : PATHVALUE;
//title : TITLE;

//////////////////////////////////////////////////////////

TEXT : ~[@]+;

METHOD : '{' ID '} ' ;
PATHVALUE : ID .*? ' ';
//TITLE : ID .*? '\n';
//
//WS : [ \r\n\t];
//
fragment
ID : [a-zA-Z]*;

ApiParam : '@apiParam ' ;
ApiSuccess : '@apiSuccess ' ;
ApiExample : '@apiExample ' ;
Api : '@api ';

//
//STRING
//   : (ESC | ~ ["\\])*
//   ;
//fragment ESC
//   : '\\' (["\\/bfnrt] | UNICODE)
//   ;
//fragment UNICODE
//   : 'u' HEX HEX HEX HEX
//   ;
//fragment HEX
//   : [0-9a-fA-F]
//   ;
