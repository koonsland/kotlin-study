package `03`

// 반환값이 없음을 표현하기 위해 Unit 사용
fun printlnSum(a: Int, b: Int): Unit = println("${a+b}")

// Unit을 사용하지 않아 자료형 추론
fun printlnSub(a: Int, b: Int) = println("${a-b}")

fun main(args: Array<String>) {
    printlnSum(10, 3)
    printlnSub(10, 3)
}
