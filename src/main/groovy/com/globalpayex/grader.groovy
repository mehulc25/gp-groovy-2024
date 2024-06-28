package com.globalpayex

/* def calculateGrade(marks) {
    if (marks > 100 || marks < 0) {
        "I"
    } else if (marks >= 70) {
        "A"
    } else if (marks >= 60) {
        "B"
    } else if (marks >= 40) {
        "C"
    } else {
        "F"
    }
} */

def calculateGrade(marks) {
    switch (marks) {
        case 70..100: "A"
            break
        case 60..69: "B"
            break
        case 40..59: "C"
            break
        case 0..39: "F"
            break
        default: "I"
    }
}

def marks = 78
println "The grade is ${calculateGrade marks}"


