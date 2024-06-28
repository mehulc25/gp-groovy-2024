package com.globalpayex

def students = [
        Tuple.tuple("mehul", 'm', 90),
        Tuple.tuple("jane", 'f', 85),
        Tuple.tuple("rahul", 'm', 78),
        Tuple.tuple("jay", 'm', 89)
]

def scanner = new Scanner(System.in)
println "please enter roll to search: "
def roll = scanner.nextInt()

def foundStudent
for (def student in students) {
    if (student.v3 == roll) {
        foundStudent = student
        break
    }
}

if (foundStudent) {
    println "Name: $foundStudent.v1\nGender: $foundStudent.v2"
} else {
    println "Student not found"
}



