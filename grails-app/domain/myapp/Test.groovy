package myapp

class Test {
	String name
	String logPath
	Date dateCreated // Predefined names by Grails will be filled automatically
	Date lastUpdated // Predefined names by Grails will be filled automatically
	
	static constraints = {
		name(size: 0..80, nullable: false)
		logPath(nullable: true)
	}
}
