package com.globalpayex.college

class Contact {

    String email
    Long mobile
    String websiteUrl


    @Override
    String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobile=" + mobile +
                ", websiteUrl='" + websiteUrl + '\'' +
                '}';
    }
}
