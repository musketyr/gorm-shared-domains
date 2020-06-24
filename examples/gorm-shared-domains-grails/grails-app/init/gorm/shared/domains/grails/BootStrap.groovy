package gorm.shared.domains.grails

import com.agorapulse.gorm.shared.domains.PersonService

class BootStrap {

    PersonService personService

    def init = { servletContext ->
        personService.create('Vladimir', 'Orany', 'vlad@agorapulse.com')
    }

    def destroy = { }

}
