package app

import data.Function

fun main() {
	val function = Function("eko")

	function.sayHello<String>("Joko")
	function.sayHello("Joko")

	function.sayHello(10)
	function.sayHello<Int>(10)
}