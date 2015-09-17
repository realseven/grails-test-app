package myapp

class User {
	String uid
	String name
	String email
	
    static constraints = {
		uid(size: 1..20, blank: false, unique: true)
		name(size: 0..80, nullable: false)
		email(maxSize: 40, blank: false, nullable: true)
    }
}
