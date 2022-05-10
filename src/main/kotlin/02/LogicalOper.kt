package `02`

fun main(args: Array<String>) {
    val num1: Int = 5
    val num2: Int = 3
    val num3: Int = 2

    // (5>3) && (5>2) => true && true => true
    println( (num1 > num2) && (num1 > num3) )
    // (5>3) || (5<2) => true || false => true
    println( (num1 > num2) || (num1 < num2) )
    // !(5>3) => !true => false
    println( !(num1 > num2) )
}