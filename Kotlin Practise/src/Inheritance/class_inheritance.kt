package Inheritance

public open class Person(var firstName: String, var lastName: String, var age: Int)
{
	fun fullName() = "$firstName $lastName"
}

class Employee(firstname: String, lastName: String, age: Int = 18, var company: String, var email: String)
		: Person(firstname, lastName, age)

fun main(agrs: Array<String>)
{
	val employee = Employee(firstname = "Hannan", lastName = "Talukder",
		email = "h@gmail.com", company = "Lsoft Ltd")
	
	println("Employee ${employee.fullName()} is ${employee.age} and works at ${employee.company},  "+
	"Emain: ${employee.email}")
	
}

