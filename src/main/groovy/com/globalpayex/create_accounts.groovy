package com.globalpayex

import com.globalpayex.banking.Account

def a1 = new Account(accType: 'Savings', accNumber: '1234ABC', balance: 10000, contactNos: [9876576565])

// def ub = a1.withdraw 5000
def ub = a1 - 5000 // internally a1.minus(5000)
println ub

// ub = a1.deposit 4000
ub = a1 + 4000 // internally a1.plus(4000)
println ub


// a1.contactNos << 8776532745
a1 << 87687678
println a1.contactNos

def a2 = new Account(accType: 'Savings', accNumber: '56ERT', balance: 10000)
a2 << 8786876876 << 988767858
println a2.contactNos
