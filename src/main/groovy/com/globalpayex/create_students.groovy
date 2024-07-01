package com.globalpayex

import com.globalpayex.college.Student

println Student.count
def s1 = new Student(name: 'mehul', marks: 90, gender: 'm', roll: 10)


println Student.count
def s2 = new Student(name: 'jane', gender: 'f', roll: 11, marks: 67)

println Student.count

s1.gender = 'x' // internally s1.setGender('x')
println s1.getDetails()
println s2.getDetails()

println s1.calculateGrade()
println s2.calculateGrade()

def s3 = Student.create(gender: 'f', name: 'jill', roll: 15, marks: 78)
println s3.getDetails()

s3.roll = -67 // encapsulation // s3.setRoll(-67) -- done internally!!!
println s3.getDetails()
println s3.roll

s3.roll = 20
println s3.getDetails()

println s3.gender // Internally s3.getGender()

def s4 = new Student()
println s4.gender // internally s4.getGender()