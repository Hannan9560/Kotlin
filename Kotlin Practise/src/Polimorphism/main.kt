package Polimorphism


fun main(args: Array<String>)
{
	val chiwawa = Chiwawa("Fifi")
	val greatDana = GreatDana("Charles")
	
	println("Chiwawa - Name: ${chiwawa.petName}, Max Age: ${chiwawa.MAX_AGE}")
	println("Chiwawa Stats -${chiwawa.stats()}")
	println("Chiwawa Sound - ${chiwawa.makeSound()}")
	println("Chiwawa Move - ${chiwawa.doMove()}")
	chiwawa.petName = "Nippy"
	println("Chiwawa's New Name - ${chiwawa.petName}\n")
	
	println("Great Dana: Name - ${greatDana.petName}, Max Age: ${greatDana.MAX_AGE}")
	println("Great Dana Stats - ${greatDana.stats()}")
	println("Great Dana Sound - ${greatDana.makeSound()}")
	println("Great Dana Move - ${greatDana.doMove()}")
}