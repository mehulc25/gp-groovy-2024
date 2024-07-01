package com.globalpayex.banking

class Account {
    String accNumber
    String accType
    Double balance
    List contactNos = []

    Double withdraw(Double amt) {
        this.balance -= amt
    }

    Double deposit(Double amt) {
        this.balance += amt
    }

    // Operator overloading
    Double minus(Double amt) {
        this.withdraw(amt)
    }

    Double plus(Double amt) {
        this.deposit(amt)
    }

    Account leftShift(Long contactNo) {
        this.contactNos << contactNo
        this
    }
}
