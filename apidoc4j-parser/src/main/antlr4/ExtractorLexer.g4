lexer grammar ExtractorLexer ;

channels {CHANNEL_COMMENT}

COMMENT    : '/**' .*? '*/' -> channel(CHANNEL_COMMENT) ;
