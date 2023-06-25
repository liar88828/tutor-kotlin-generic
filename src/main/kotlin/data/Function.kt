package data

class Function(val name: String) {
	fun <T> sayHello(params: T) {
		println("Hello $params , my name is $name")
	}


}