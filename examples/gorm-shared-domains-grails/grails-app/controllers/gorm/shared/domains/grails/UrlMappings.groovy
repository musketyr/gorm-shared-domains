package gorm.shared.domains.grails

class UrlMappings {

    static mappings = {
        "/"(controller: 'index')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
