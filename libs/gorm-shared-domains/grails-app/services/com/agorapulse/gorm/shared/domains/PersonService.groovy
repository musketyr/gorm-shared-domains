package com.agorapulse.gorm.shared.domains

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

import javax.inject.Singleton

@Transactional
@CompileStatic
@Singleton
class PersonService {

    Person create(String firstName, String lastName, String email) {
        Person person = new Person(firstName: firstName, lastName: lastName, email: email)
        person.save(true)
        return person
    }

    List<Person> getAllPersons() {
        Person.list()
    }

}
