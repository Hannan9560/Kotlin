fun main(args: Array<String>)
{
	
//	Array
	var days = arrayOf("Mon", "Wed", "Th", "Fri")
	println(days.toList())
	println(days[2])
	days[3] = "Friday"
	println(days.toList())
	println(days.size)
	days += "Thurs"
	println((days.toList()))
	
//	List, mutableList
	val fruits = mutableListOf("Banana", "Kiwifruit", "Mango", "Apple")
	fruits.add("Pear")
	println(fruits)
	fruits[1] = "Jackfruit"
	println(fruits)
	fruits.removeAt(2)
	println(fruits)
	
	
//	Immutable List
	val fruit = listOf("Banana", "Kiwifruit", "Mango", "Apple")
//	Set
	val animals = mutableListOf("Lion", "Dog", "Cat", "Python", "Hippo")
	println(animals)
	animals.add("Dog")
	println(animals)
	animals.remove("Python")
	println(animals)
	
//	Map
	val nzPop = mutableMapOf("AUCK" to 150, "WLG" to 151, "CHCH" to 152, "GIS" to 153)
	println(nzPop)
	nzPop["CHCH"] = 154
	println(nzPop)
	nzPop.remove("GIS")
	println(nzPop)
	nzPop["DUN"] = 149
	println(nzPop)

}