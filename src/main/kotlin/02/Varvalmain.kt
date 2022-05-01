package `02`

fun main(args: Array<String>) {
    val number1:Int = 10 // val 읽기전용 변수 선언
    var number2 = 20 // var 변수 선언 (자료형 추론)
    val name = "Koonsland" // name의 자료형은 String으로 추론
    var subject: String = "Java" // subject 자료형 String으로 명시

    subject = "Kotlin"

    println("number1: $number1")
    println("number2: $number2")
    println("name: $name")
    println("subject: $subject")
}