fun main(args: Array<String>)
{
	var msg: String
	println("Please Enter")
	msg = readLine()?: ""
	println(msg)
	var number = -1
	println("Enter number")
	msg = readLine()?:""
	println(Integer.valueOf(msg))

	var age = -1
	println("Enter first name: ")
	val firstname = readLine()
	println("Enter second nam: ")
	val lastName = readLine()
	println("Enter age: ")
	
	try{
		age = Integer.valueOf(readLine())
		println("Hello $firstname $lastName, you are $age years old")
	}catch(ex: NumberFormatException)
			{
				println("Age isn't valid")
			}
	
	
}