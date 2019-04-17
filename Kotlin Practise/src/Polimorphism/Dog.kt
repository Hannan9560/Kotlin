package Polimorphism

internal open class Dog(var petName: String = "", open protected val coat: String,
						open protected val energy: Int) : AnimalBase{
	
	override val MAX_AGE = 15
	
	override fun doMove() = "Walks/runs"
	override fun makeSound() = "Woof!"
	
	fun stats() = "Coat: $coat, Energy: $energy"
	
}

