package app

import data.MyData

fun main() {
	val myDataString = MyData<String, Int>("Eko", 12)
	println(myDataString.getData())
	println(myDataString.getDataSecond())
	myDataString.printData()

	val myDataInt: MyData<Int, String> = MyData(1, "Kurniawan")
	println(myDataInt.getData())
	println(myDataInt.getDataSecond())
	myDataInt.printData()
}