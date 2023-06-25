package app

class Container<T>(var data: T)

fun copyContainer(
	from: Container<out Any>,// invariant
	to: Container<in Any>// contravariant
) {
	to.data = from.data
}

fun main() {
	val container1 = Container("Eko")
	val container2 = Container<Any>("Kurniawan")
	copyContainer(container1, container2)

	println(container1.data)
	println(container2.data)
}