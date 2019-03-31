fun main(args: Array<String>)
{
	greater()
	{
		"jane doe"
	}
	
//	Extension Function
	println("7 is valid number: ${"7".isNumber()}")
	println("Joe is valid number: ${"Joe".isNumber()}")
	
	
}fun greater(msg: () -> String)
	{
		println("Hello ${msg()}")
	}
fun String.isNumber(): Boolean{
	var valid = true
	try{
		Integer.valueOf(this)
	}catch(ex: NumberFormatException)
			{
				valid = false
			}
	return valid
}