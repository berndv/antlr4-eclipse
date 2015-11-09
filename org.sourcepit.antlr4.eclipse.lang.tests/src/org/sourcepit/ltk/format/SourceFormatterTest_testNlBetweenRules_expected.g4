grammar testNlBetweenRules;

options { }

tokens {
    T1
}

foo
    : FOO
    ;

bar
    : BAR
    ;

FOO
    : 'FOO'
    ;

BAR
    : 'BAR'
    ;