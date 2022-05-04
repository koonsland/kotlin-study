package `02`

fun main(args: Array<String>) {
    val double1 = Double.MAX_VALUE // Double로 자동 추론
    val float1: Float = Float.MAX_VALUE // Float로 명시

    println("double1: $double1")
    println("float1: $float1")
}