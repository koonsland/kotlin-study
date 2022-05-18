package `03`

// 문자열 매개변수
fun concat(lastname:String, firstname: String) = lastname + firstname
// 매개변수 기본값
fun defaultConcat(lastname:String, firstname:String = "land") = lastname + firstname
// 여러 인자 매개변수
fun vararg(vararg value: String): String {
    var text: String = ""
    for (v in value)
        text += v
    return text
}

fun main(args: Array<String>) {
    println(concat("Koons", "land"))
    println(defaultConcat("Koons"))
    println(concat(firstname = "land", lastname = "Koons"))
    println(vararg("K", "o", "o", "n", "s", "l", "a", "n", "d"))
}