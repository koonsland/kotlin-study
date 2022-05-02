package `02`

fun main(args: Array<String>) {
    val int1 = 127 // 범위는 Byte 자료형이지만 Int 형으로 추론
    val int2 = -32768 // 범위는 Short 자료형이지만 Int 형으로 추론
    val int3 = 123456 // Int 형으로 추론
    val long1 = 2147483648 // Long 형으로 추론
    val long2 = 123L // Long 형으로 추론
    val byte1: Byte = 127 // Byte 형으로 명시적 지정
    val short1: Short = 32767 // Short 형으로 명시적 지정
}