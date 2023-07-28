

val name = "Vontha"
var greeting: String? = null

fun main() {
    greeting = "Hey"
    when(greeting){ //when
        null -> println("Hi") //is null
        else -> println(greeting) //else
    }
    println(name)
}