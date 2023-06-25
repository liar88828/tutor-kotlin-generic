package app

class Contravariant<in T> {
	fun sayHello(params: T) = println("Hello $params")

	// tidak boleh mengembalikan data generic
//	fun getData(): T {
//		return data
//	}

}

fun main() {
	val contravariantAny = Contravariant<Any>()
	val contravariantString: Contravariant<String> = contravariantAny
//	contravariantString.getData()// error
	contravariantString.sayHello("Eko")
}