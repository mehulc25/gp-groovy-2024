package com.globalpayex

// Closures
// very much - function
// closure value - parameters, body, return a value

def operations(a, b) {
    def i = 10
    // computes the addition
    def add = {
        // closure can access enclosing scope data
        def r1 = a + b
        r1 + 10 // deliberately done to show complexity in the logic!
    }

    // computes the multiplication
    def multiplication = {
        def r2 = a * b
        r2 + 10
    }

    println add()
    println multiplication()
}
operations 5, 6


def nos = [5, 6, 10, 2, 4, 3, 9, 6, 1]

// general purpose function
def forEach(list, fn) {
    for(def element in list) {
        fn(element)
    }
}

/* def fn(element) {
    if (element % 2 == 0) {
        println element
    }
} */
println "*****evens***"
def fn = {element ->
    if (element % 2 == 0) {
        println element
    }
}
forEach(nos, fn)

println "****odd more than 3***"
// print only odd numbers more than 3
/* forEach(nos, {element ->
    if (element % 2 && element > 3) {
        println element
    }
}) */
/* forEach(nos, {
    // implicit parameter `it`
    if (it % 2 && it > 3) {
        println it
    }
}) */

forEach(nos) {
    if (it % 2 && it > 3) {
        println it
    }
}
