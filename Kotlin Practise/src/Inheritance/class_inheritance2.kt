package Inheritance

open class Building(var name: String)
{
	fun info() = "A building called $name"
}

open class House(name: String, var rooms: Int) : Building(name)
{
	val materials = mutableListOf<String>()
	
	
	constructor(name: String, rooms: Int, materials: List<String>) : this(name = name, rooms = rooms)
	{
		this.materials.addAll(materials)
	}
}

fun main(args: Array<String>)
{
	val materials = listOf("Brick", "Wood", "Glass", "Stone")
	val house = House(name = "Wally Manor", materials = materials, rooms = 8)
	
	println("${house.info()} which is a house that is made of ${house.materials} and has ${house.rooms} rooms")
	
	house.materials.addAll(listOf("Marbel", "Gold"))
	println("New house materials: ${house.materials}")
}
