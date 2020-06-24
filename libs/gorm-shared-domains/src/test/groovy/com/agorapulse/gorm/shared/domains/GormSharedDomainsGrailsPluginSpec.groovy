package com.agorapulse.gorm.shared.domains

import spock.lang.Specification

class GormSharedDomainsGrailsPluginSpec extends Specification {

    void 'all artefacts are present'() {
        when:
            String descriptorText = GormSharedDomainsGrailsPlugin.getResourceAsStream('/META-INF/grails-plugin.xml').text
        then:
            descriptorText

        when:
            Collection<String> resources = new XmlSlurper().parseText(descriptorText).resources.resource*.text()
        then:
            Person.name in resources
            PersonService.name in resources
    }

}
