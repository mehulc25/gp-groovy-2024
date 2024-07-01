package com.globalpayex

/* import com.globalpayex.college.Author
import com.globalpayex.college.Book
import com.globalpayex.college.Contact */

/* def authors = [
        new Author(name: 'mehul', gender: 'm', ratings: 5,
                contact: new Contact(email: 'mehulc@hey.com', mobile: 99868683, websiteUrl: 'https://slowathon.com' )),
        new Author(name: 'jane', gender: 'f', ratings: 4,
                contact: new Contact(email: 'jane@gmail.com', mobile: 87867663, websiteUrl: 'https://jane.com'))
]
def book = new Book(title: 'Book 1', price: 9000, pages: 1000, authors: authors)
println book
*/

// groovy builders
// ObjectGraphBuilder
def ogb = new ObjectGraphBuilder(classNameResolver: 'com.globalpayex.college')

def b = ogb.book(title: 'Book 1', price: 9000, pages: 1000) {
    author(name: 'mehul', gender: 'm', ratings: 5) {
        contact email: 'mehulc@hey.com', mobile: 9798686, websiteUrl: 'https://slowathon.com'
    }
    author(name: 'jane', gender: 'f', ratings: 4) {
        contact email: 'jane@gmail.com', mobile: 8776583, websiteUrl: 'https://jane.com'
    }
}
println b