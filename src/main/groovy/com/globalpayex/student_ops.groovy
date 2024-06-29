package com.globalpayex

def students = [
        Tuple.tuple("mehul", 'm', 90),
        Tuple.tuple("jane", 'f', 85),
        Tuple.tuple("rahul", 'm', 78),
        Tuple.tuple("jay", 'm', 89)
]

// create a new list of tuple consiting of only name and marks of all the male students
def l1 = students
    .findAll {it.v2 == 'm'}
    .collect {Tuple.tuple(it.v1, it.v3)}
println l1

