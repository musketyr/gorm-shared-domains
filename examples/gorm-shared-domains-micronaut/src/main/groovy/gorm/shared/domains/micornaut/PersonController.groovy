package gorm.shared.domains.micornaut

import com.agorapulse.gorm.shared.domains.Person
import com.agorapulse.gorm.shared.domains.PersonService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/')
class PersonController {

    private final PersonService personService

    PersonController(PersonService personService) {
        this.personService = personService
    }

    @Get('/')
    List<Person> index() {
        if (!personService.allPersons) {
            personService.create('Vladimir', 'Orany', 'vlad@agorapulse.com')
        }
        return personService.allPersons
    }

}
