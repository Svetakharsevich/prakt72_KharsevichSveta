import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    try {
        println("Введите 2 стороны")
        var a= readln().toDouble()
        var b= readln().toDouble()
        when{
            (a>0&&b>0)->println("Периметр = ${(a+b)*2}; Плошадь = ${a*b}; " +
                    "Длина диагонали = ${sqrt(a.pow(2) + b.pow(2))}")
            else-> println("Введите положительные числа")
        }

    }
    catch(e: Exception) {
        println("Ошибка.Введите число")
    }
}

