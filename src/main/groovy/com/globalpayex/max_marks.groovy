package com.globalpayex

def students = [
        Tuple.tuple("mehul", 'm', 90),
        Tuple.tuple("jane", 'f', 85),
        Tuple.tuple("rahul", 'm', 78),
        Tuple.tuple("jay", 'm', 89)
]

def maxTuple = students[0]

for (def student in students) {
    if (student.v3 > maxTuple.v3) {
        maxTuple = student
    }
}

println "Name: $maxTuple.v1\nGender: $maxTuple.v2\nMarks: $maxTuple.v3"

