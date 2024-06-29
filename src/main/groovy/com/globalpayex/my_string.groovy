package com.globalpayex

String.metaClass.csvify = {
    // delegate <---> this
    delegate.replaceAll " ", ","
}


def data = 'mehul m 10 90'
// str -> mehul,m,10,90
println data.csvify()

