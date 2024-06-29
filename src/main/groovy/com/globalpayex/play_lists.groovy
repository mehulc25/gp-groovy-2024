package com.globalpayex

// List
// ordered collection of elements
// allows duplicates

def cars = ["audi", "bmw", "i20"]
def el = []

// indexing accessing
println cars[0]
println cars[-1]

// indexing modify
cars[-1] = "mercedes"
println cars

// sublist
def marks = [10, 5, 6, 10, 6, 7, 8, 1, 0]
println marks[-4..-1]
println marks[0..4]

// membership
println "bmw" in cars
println "i10" in cars

// iteration
for(def car in cars) {
    println car.toUpperCase()
}

// add element at the end
cars << "porshe"
println cars
cars << "i10" << "i20"
println cars

// remove from the end
cars.removeLast()
println cars
cars.removeLast()
println cars

// add element at the start of the list
cars.push("i10")
println cars

// remove element from the start of the list
cars.pop()
println cars


def m1 = [1, 3, 5]
def m2 = [3, 5, 9]

println m1 - m2
println m2 - m1
println m1.intersect(m2)
println((m1 + m2).unique())

// statistics
println marks.max()
println marks.min()
println marks.average()

def marksDivisions = [
        [5, 6, 10, 3],
        [6, 7, 10, 2],
        [6, 9, 1]
]

println marksDivisions.flatten().average()


def names = ["mehul", "jane", null, "rahul"]
println names*.toUpperCase() // wont give a null pointer exception. null will be ignored

// safe object navigation (?.)
names.each {println it?.toUpperCase()}


