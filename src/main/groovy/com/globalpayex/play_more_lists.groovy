package com.globalpayex

def nos = [5, 6, 3, 4, 9, 10, 3, 7, 1, 2]

// print all even numbers more than 2 from nos list
println "*** evens more than 2 *****"
nos.each {
    if (it % 2 == 0 && it > 2) {
        println it
    }
}

// from the nos list, create separate list of evens and list of odds
def evens = []
def odds = []

nos.each {
    if (it % 2) {
        odds << it
    } else {
        evens << it
    }
}

println evens
println odds


// create a new list from nos list consisting of only marks scored more than 5
// filtering
def l1 = nos.findAll {it > 5}
println l1

// create a new list from nos list consisting of marks deducted by 1
// mapping
def l2 = nos.collect {it - 1}
println l2

// create a new list
    // filter odd elements more than 3 from nos list
    // square the filtered out odd numbers
def l3 = nos
        .findAll {it % 2 && it > 3}
        .collect {it ** 2}
println l3

// find out whether every student has scored above 3 marks or no from the nos list
println nos.every {it > 3}

def cars = ['audi', 'bmw', 'mercedes']
// create a new list of car names from the cars list in a capitalized format
def l4 = cars.collect {it.capitalize()}
println l4

// Spread dot operator (*.)
def l5 = cars*.capitalize()
println l5

def l6 = nos*.minus(1)
println l6




