package com.globalpayex

// Tuple
// Heterogenous data
// ordered
// immutable

def t1 = Tuple.tuple("mehul", 10, 'm', 90)

// access elements
println t1.v1
println t1.v3
println t1.v4

// iterate
for(def v in t1) {
    println v
}

// modify
// t1.v1 = "Jane" // cannot modify
// t1.v2 = 11

// t1.push("india")