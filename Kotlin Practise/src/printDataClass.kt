fun printDataClass()
{
	val person = Person(firstName = "hannan", lastname = "Talukder", age = 20)
	val(firstName, lastName, age) = person
	
	println("Data class: $person")
	println("Object Destructing: First name -$firstName, Last Name -$lastName, Age -$age")
		
}