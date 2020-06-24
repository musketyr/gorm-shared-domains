package gorm.shared.domains.micornaut

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {

    static void main(String[] args) {
        Micronaut.build(args)
                 .packages('com.agorapulse.gorm.shared.domains')
                 .mainClass(Application)
                 .start()
    }

}
