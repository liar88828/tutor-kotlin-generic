package app


interface CanSayHello {
	fun sayHello(name: String)
}

open class Employee
class Manager : Employee()
class VicePresident : Employee(), CanSayHello {
	override fun sayHello(name: String) = println("Hello $name, I,m vice president")
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
//	val data1 = Company(Employee())//error karena tidak bisa canSayHello
//	val data2 = Company(Manager())// error karena tidak bisa canSayHello
	val data3 = Company(VicePresident())
//	val data4=Company("String")// error karena bukan class
}