package `03`

// 기본 함수 형태
fun sum(a: Int, b: Int): Int {
    return a + b
}

// return을 제거한 형태
fun sub(a: Int, b: Int): Int = a - b

// 반환 자료형 추론 형태
fun mul(a: Int, b: Int) = a * b
// 반환 자료형 추론 형태
fun div(a: Int, b: Int) = a / b

fun main() {
    val ret1 = sum(1, 3)
    val ret2 = sub(10, 5)
    val ret3 = mul(4, 2)
    val ret4 = div(9, 3)

    println(ret1)
    println(ret2)
    println(ret3)
    println(ret4)
}
