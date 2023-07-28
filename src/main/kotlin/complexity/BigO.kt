package complexity

fun main() {
    log(arrayOf(1,2,3))
}

//O(1)
fun log(numbers: Array<Int>): Unit {
    println("O(1)")
    println("${numbers[0]}")

    println("O(N)") // Ex. Linear Search
    for (i in numbers.indices){ //O(N)
        println(numbers[i])
    }

    println("O(N^2)")
    for (first in numbers){ //n
        for (second in numbers){ //n
            println("First: $first and Second $second")
        }
    }

    println("O(logN) is scalable") // Ex. Binary Search
    println("O(2^n) is not scalable")

}

//O(n)
fun logN(numArray: Array<Int>){

}