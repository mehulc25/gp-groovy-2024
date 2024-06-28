package com.globalpayex

def n = 53
// print all odd numbers till n

/* for(def i = 0; i <= n; i++) {
    if (i % 2) {
        println i
    }
} */

// Groovy for loop
/*
for(def v in <<sequence of elements>>) {
 // I1
 // I2
 // I3
}
 */

// 0 - n
// 0..n
for(def v in 0..n) {
    if (v % 2) {
        println v
    }
}


