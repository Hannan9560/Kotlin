fun printClass()
{
	
	val order = Order("Widgets", 5, 9.99)
	
	println("Order info before: Item -${order.item}, Quantity -${order.quantity}, Total Price -${order.price}")
	order.quantity = 7
	order.price = 25.78
	println("Order info After: Item -${order.item}, Quantity -${order.quantity}, price -${order.price}")
	println("Order info: Item -${order.item}, Quantity -${order.quantity}, price -${order.price}")
}