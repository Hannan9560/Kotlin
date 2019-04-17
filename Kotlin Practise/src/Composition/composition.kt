package Composition

interface AnimalBase{
	val MAX_AGE: Int
	get() = 10
	
	fun makeSound() = "Makes a sound"
	
	fun doMove() = "Does a move"
}
class Snake : AnimalBase

fun main(args: Array<String>)
{
	val snake = Snake()
	
	println("Snake Sound: ${snake.makeSound()}")
	println("Snake Move: ${snake.doMove()}")
	println("Snake Max Age: ${snake.MAX_AGE}")
}
