grammar Demo;


root :  method ;


method : METHOD;

METHOD : '{' STRING '}' WS;

/////
WS
   : [ \t\n\r] +
   ;

STRING
   : (ESC | ~ ["\\])*
   ;
fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
   ;

