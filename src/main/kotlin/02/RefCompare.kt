package `02`

fun main(args: Array<String>) {
    val temp1: Int = 128 // Int 자료형 명시. 정적 변수
    val temp2 = temp1

    val temp3: Int? = temp1 // 물음표(?)를 사용한 참조형 변수
    val temp4: Int? = temp1
    val temp5: Int? = temp3

    println(temp1 === temp2)
    println(temp3 == temp4)
    println(temp3 === temp4)
    println(temp3 === temp5)
}