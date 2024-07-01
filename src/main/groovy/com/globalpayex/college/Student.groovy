package com.globalpayex.college

// Groovy bean
class Student {
    // instance variables
    String name
    Character gender
    Integer roll
    Integer marks

    // static variable
    static Integer count = 0

    // constructors
    Student() {
        Student.count++
    }
    // default
    /* Student(Map map) {
        this()
        this.name = map['name']
        this.gender = map['gender']
        this.roll = map['roll']
        this.marks = map['marks']
    } */

    // instance methods
    String getDetails() {
        // this --> current object
        "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
    }

    void setRoll(Integer roll) {
        if (roll > 0) {
            this.roll = roll
        }
    }

    void setGender(Character gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender
        }
    }

    Character getGender() {
        this.gender?.toUpperCase()
    }

    Character calculateGrade() {
        switch (this.marks) {
            case 0..39: 'F'
                break
            case 40..59: 'C'
                break
            case 60..69: 'B'
                break
            case 70..100: 'A'
                break
            default: 'I'
        }
    }


    // static methods
    static Student create(Map map) {
        new Student(map)
    }
}
