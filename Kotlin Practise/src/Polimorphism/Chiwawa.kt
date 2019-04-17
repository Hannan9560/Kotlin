package Polimorphism
internal class Chiwawa(petName: String) : SmallDog()
{
	override fun makeSound() = "yap, Yap, yap!"
	
	init{
		this.petName = petName
	}
}

