package app

class Invariant<T>(var data: T) {
}

fun main() {
	val invariantString = Invariant("String")
//	val invariantAny: Invariant<Any> = invariantString //error
//	invariantAny.data = 100// bahaya
}