package com.globalpayex.college

class Book {

    String title
    Integer pages
    Double price
    List<Author> authors = []


    @Override
    String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", authors=" + authors +
                '}';
    }
}
