package app

class Covariant<out T>(val data: T) {
	fun myData(): T {
		return data
	}

// tidak boleh membuat function dengan generik covariant
//	fun setData(params: T) {
//		data = params
//	}

}

fun main() {
	val covariantString = Covariant<String>("Eko")
	val covariantAny: Covariant<Any> = covariantString
	println(covariantAny.myData())
//	covariantAny.setData(100)// tidak Boleh
}