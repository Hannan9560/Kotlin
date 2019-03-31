fun main(args: Array<String>)
{
//	If Statement
	val age = 15
	if(age <= 12)
		{
			println("Child")
		}
	else if(age >= 13 && age <= 17)
		{
			println("Teenager")
		}
	else {
		println("Adult")
	}
	
	
	val personType = if(age <= 12)
		{
			"Child"
		}
	else if(age >= 13 && age <= 17)
		{
			"Teenager"
		}
	else{
		"Adult"
	}
	println(personType)
	
//	When statement
	val num = 77
	
	when(num){
		in 1..10 -> println("Number is in the range")
		in 10..20 -> println("Number is outside the range")
		in 20..80 -> println("I am there")
		!in 20..80 -> println("I am there f")
		else -> println("None of the above")
	}
	
	 val x = "Batman"
	
	val hasPrefix = when(x)
		{
		is String -> x.startsWith("Bat")
		else -> false
		}
	println(hasPrefix)
	
//	Handling Nulls
	val name: String? = "Joe"
	println(name?.startsWith("J"))
	
	val name1: String? = "Rover"
	if(name1 != null)
		println("Name start with J: ${name1.startsWith("J")}")
	else
		println("Name is null")
	
	
	val name2: String? = "Roy"
	println(name?.startsWith("R") ?: "name is null")
	
//	For Loops
	val days = listOf("Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun")
	for(d in days)
		{
			println(d)
		}
	for(x in 1..10)
		{
			if(x == 5)
				
				continue
			println(x)
		}
	
//	For Loops with MAP
	val nzPop = mapOf("AUCK" to 180, "WLG" to 181, "CHCH" to 182, "GIS" to 183)
	for((key, value) in nzPop)
		{
			println("$key -> $value")
		}
	
	
//	While loops
	var x1 = 1
	while(x1 <= 10)
		{
			println(x1)
			++x1
		}
	
//	Do__While loops
	 x1 = 12
	do{
		println(x1)
		++x1
	}while(x1 <= 10)
}