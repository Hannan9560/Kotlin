fun printEnum()
{
	val currentDay = Day.SUN
	
	for(d in Day.values())
		{
			println("Day: $d")
		}
	println("Current Day: $currentDay")
	when(currentDay)
		{
		Day.MON, Day.TUE, Day.WED, Day.THUR, Day.FRI -> println("Weekday")
		Day.SAT, Day.SUN -> println("weekend")
	}
	
}