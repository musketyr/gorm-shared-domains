package com.agorapulse.gorm.shared.domains

import grails.gorm.annotation.Entity

@Entity
class Person {

    String firstName
    String lastName
    String email

    static constraints = {
        firstName maxSize: 256
        lastName maxSize: 256
        email maxSize: 256, nullable: true
    }

}
