package gorm.shared.domains.grails

import com.agorapulse.gorm.shared.domains.Person
import grails.converters.JSON

class IndexController {

    def index() {
        render Person.list() as JSON
    }

}
