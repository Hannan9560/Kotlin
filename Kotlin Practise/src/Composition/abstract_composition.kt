package Composition

interface AnimalBase1
{
	val MAX_AGE: Int
	
	fun makeSound(): String
	fun doMove(): String
}

class Snake1: AnimalBase1{
	override val MAX_AGE = 10;
	
	override fun doMove() = "Slithers"
	
	override fun makeSound() = "Hisses"
}

fun main(args: Array<String>)
{
	val snake = Snake1()
	
	println("Snake Sound: ${snake.makeSound()}")
	println("Snake Move: ${snake.doMove()}")
	println("Snake Max Age: ${snake.MAX_AGE}")
}
