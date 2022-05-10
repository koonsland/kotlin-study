package `02`

fun main(args: Array<String>) {
    var num1: Int = 10
    var num2: Int = 3

    println("num1: ${num1++}") // num1: 10
    println("num2: ${++num2}") // num2: 4
    println("num1: $num1, num2: $num2") // num1: 11, num2: 4
}