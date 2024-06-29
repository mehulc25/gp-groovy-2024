package com.globalpayex

def students = [
        90: Tuple.tuple("mehul", 'm', 90),
        85: Tuple.tuple("jane", 'f', 85),
        78: Tuple.tuple("rahul", 'm', 78),
        89: Tuple.tuple("jay", 'm', 89)
]

def scanner = new Scanner(System.in)
println "please enter roll to search: "
def roll = scanner.nextInt()

def foundStudent = students[roll]
if (foundStudent) {
    println "Name: $foundStudent.v1\nGender: $foundStudent.v2"
} else {
    println "Student not found"
}


