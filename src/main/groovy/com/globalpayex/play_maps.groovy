package com.globalpayex

// Map
// Entry: Key and value
// Key should be unique, indexing happens by key
// Mutable

def em = [:]
def smap = [E001: 'mehul', E0010: 'jane']

// add a new entry
smap['E003'] = 'rahul'
println smap

// update an existing entry
smap['E0010'] = 'jill'
println smap

// remove an entry from  map
smap.remove('E003')
println smap

// other functions
println smap.size()
println smap.keySet()
println smap.values()

// iteration
for(def entry in smap) {
    println "Emp id: $entry.key\nEmp name: $entry.value"
}

// membership
println 'E003' in smap
println 'E001' in smap

