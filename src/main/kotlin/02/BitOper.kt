package `02`

fun main(args: Array<String>) {
    val num1: Int = 16 // 0001 0000
    val num2: Int = 27 // 0001 1011

    // 0010 0000
    println("num1 shl 1 = ${num1 shl 1}")
    // 0000 0100
    println("num1 shr 2 = ${num1 shr 2}")
    // 0000 0100
    println("num1 ushr 2 = ${num1 ushr 2}")
    // 0001 0000
    println("num1 and num2 = ${num1 and num2}")
    // 0001 1011
    println("num1 or num2 = ${num1 or num2}")
    // 0000 1011
    println("num1 xor num2 = ${num1 xor num2}")
    // 1110 0100
    println("num2 inv = ${num2.inv()}")
}