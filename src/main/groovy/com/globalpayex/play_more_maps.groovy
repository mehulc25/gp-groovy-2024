package com.globalpayex

def students = [
        90: Tuple.tuple("mehul", 'm', 90),
        85: Tuple.tuple("jane", 'f', 85),
        78: Tuple.tuple("rahul", 'm', 78),
        89: Tuple.tuple("jay", 'm', 89)
]

// print the name and roll number of all the male students
/* students.each {
    if (it.value.v2 == 'm') {
        println "Name: $it.value.v1\nRoll: $it.key"
    }
} */

students.each {roll, studentTuple ->
    if (studentTuple.v2 == 'm') {
        println "Name: $studentTuple.v1\nRoll: $roll"
    }
}

// create a new map consisting of only the male students from `students` map
// filtering
def m2 = students
        .findAll {rollNo, studentTuple -> studentTuple.v2 == 'm'}
println m2

// create a new map where the names of all the students is converted to capital case
// mapping
def m3 = students
        .collectEntries {rollNo, studentTuple ->
            [rollNo, Tuple.tuple(studentTuple.v1.capitalize(), studentTuple.v2, studentTuple.v3)]}
println m3

// count by gender from students map
def m4 = students
        .countBy {rollNo, studentTuple -> studentTuple.v2}
println m4

// group by gender from students map


