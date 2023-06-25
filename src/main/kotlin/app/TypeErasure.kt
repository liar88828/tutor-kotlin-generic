package app

class TypeErasure<T>(params: T) {
	private val data: T = params
	fun getData(): T = data
}

fun main() {
	val data = TypeErasure<String>("eko")
	val dataString: String = data.getData()
println(dataString)
	val data2: TypeErasure<Int> = data as TypeErasure<Int>
//	val dataInt: Int = data2.getData()//error
//	println(dataInt)

}