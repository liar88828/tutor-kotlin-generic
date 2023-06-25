package app

fun diplayLength(array: Array<*>) = println("Total array is ${array.size}")

fun main() {
	val arrayString: Array<String> = arrayOf("eko", "kurniawan", "kannedy")
	val arrayInt: Array<Int> = arrayOf(1,2,3,4,5)
	diplayLength(arrayString)
	diplayLength(arrayInt)

}