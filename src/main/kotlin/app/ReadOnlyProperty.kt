package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data: String) : ReadOnlyProperty<Any, String> {
	var counter: Int = 0
	override fun getValue(thisRef: Any, property: KProperty<*>): String {
		println("Access property ${property.name} with value $data ")
		counter++
		return data.uppercase() + counter
	}
}


class NameWithLog(param: String) {
	val name: String by LogReadOnlyProperty(param)// delegates

}

fun main() {
	val nameWithLog = NameWithLog("Eko kurniawan")
	println(nameWithLog.name)
	println(nameWithLog.name)
}