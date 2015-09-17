class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		"/api/user"(resources: 'user')
		"/api/test"(resources: 'test')
		
        "/"(view:"/index")
        "500"(view:'/error')
				
/*		"/api/$controller/$id?"{
			action = [GET:"show", POST:"save", PUT:"update", DELETE:"remove"]
		  }*/
	}
}
