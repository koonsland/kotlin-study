package `02`

fun main(args: Array<String>) {
    val num1: Int? = 200
    val num2: Int? = 200
    val num3: Int = 30
    val num4: Int = 20

    println(num1 == num2) // 두 값이 같으므로 true
    println(num1 != num2) // 두 값이 같으므로 false
    println(num1 === num2) // 두 참조주소가 다르므로 false
    println(num1 !== num2) // 두 참조주소가 다르므로 true
    println(num3 > num4) // num3가 더 크므로 true
    println(num3 >= num4) // num3가 더 크므로 true
    println(num3 < num4) // num3가 더 크므로 false
    println(num3 <= num4) // num3가 더 크므로 false
}