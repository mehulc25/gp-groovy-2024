package com.globalpayex

List.metaClass.evens = {
    delegate.findAll { it % 2 == 0}
}

List.metaClass.sortDescending = {
    // delegate.sort(false) {o1, o2 -> o2.compareTo(o1)}
    // Spaceship operator (<=>)
    delegate.sort(false) {o1, o2 -> o2 <=> o1}

}

def nos = [5, 6, 2, 3, 8, 9, 10, 1, 0, 4]
println nos.evens()

def n = [5, 3, 2, 8, 10]
println n.evens()

println nos.sortDescending()

