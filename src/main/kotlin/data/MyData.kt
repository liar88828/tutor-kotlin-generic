package data

class MyData<T, U>(val firstData: T, val secondData: U) {

	fun getData(): T = firstData
	fun getDataSecond(): U = secondData

	fun printData() = println("Data is $firstData $secondData")

}