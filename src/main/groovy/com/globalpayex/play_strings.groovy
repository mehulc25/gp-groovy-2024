package com.globalpayex

def fullName = "mehul chopra"
def msg = 'good morning'
def addition = "Addition is ${4 + 3}"

def sql = '''
    select username, password
    from users
    where username = 'abc'
'''
println sql

// indexing
println msg[0]
println msg[3]
println msg[-1]
println msg[-3]

// substring
println fullName[0..4]
println msg[-4..-1]

// iteration
for(def v in msg) {
    println v
}

// other operations
println fullName.toUpperCase()
println msg.capitalize()
println msg.startsWith("good")
println msg.endsWith("night")
println fullName.contains("hul")

def msg1 = 'good morning to all. have a good day ahead'
println msg1.count("good")

def age = '37'
println age.isNumber()
def pi = '3.14'
println pi.isFloat()
def username = "mehul25"
println username.isNumber()

println fullName.reverse()

println fullName.size()

def studentData = '        mehul,m,10,90                            '
println studentData.strip()

def maliciousData = '    '
println maliciousData.isAllWhitespace()

def m1 = "mehul chopra"
def m2 = "mehul"
def m3 = m2 + " chopra"
def m4 = "mehul chopra"

println m1
println m3

println m1 == m3 // equals
// in groovy strings can be compared using ==
println m1 === m3 // compare addresses
println m1 === m4 // compare addresses

def a = 5
def b = 4 + 1

// println a == b








