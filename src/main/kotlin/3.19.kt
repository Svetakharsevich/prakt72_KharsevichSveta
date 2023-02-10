import kotlin.math.pow

fun main() {
    try {
        println("Введите объем")
        var V= readln().toDouble()
        var p=7.9
        var m=V*p
        var a:Double=10.0
        var Na=6.02*a.pow(23)
        var M=56
        var n=m/M
        println("${n*Na}")
    }
    catch(e: Exception) {
        println("Ошибка.Введите число")
    }
}

