package Polimorphism

internal class GreatDana(petName: String) : LargeDog()
{
	override val MAX_AGE = 12
	override val coat = "Smooth"
	
	init{
		this.petName  = petName
	}
}