package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(params: T) : ObservableProperty<T>(params) {
	override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
		println("Before change ${property.name} from $oldValue to $newValue  ")
		return true
	}

	override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
		println("After change ${property.name} from $oldValue to $newValue  ")
	}
}


class Car(brand: String, year: Int) {
	var brand: String by LogObservableProperty(brand)
	var year: Int by LogObservableProperty(year)
	var owner: String by Delegates.notNull<String>()
	var description: String by Delegates.vetoable("")
	{ property, oldValue, newValue ->
		println("Before change ${property.name} from $oldValue to $newValue")
		true
	}
	var other: String by Delegates.observable("") { property, oldValue, newValue ->
		println("After change ${property.name} from $oldValue to $newValue")

	}
}


fun main() {
	val car = Car("Toyota", 2019)
	car.brand = "Wuling"
	car.owner = "Eko"
	println(car.year)
	println(car.brand)
	println(car.owner)

	car.other = "other"
	car.description = "Description"
	println(car.other)
	println(car.description)
}