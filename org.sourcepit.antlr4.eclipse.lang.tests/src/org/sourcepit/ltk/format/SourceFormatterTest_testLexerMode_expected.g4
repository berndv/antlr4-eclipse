lexer grammar Modes;

Foo
    : 'foo' -> pushMode( FOO )
    ;

mode FOO;

FooEnd
    : 'end' -> popMode
    ;