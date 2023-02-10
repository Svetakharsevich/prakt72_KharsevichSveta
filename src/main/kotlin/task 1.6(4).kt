import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    try {
        println("Введите x")
        var x = readln().toDouble()
        println("Введите y")
        var  y= readln().toDouble()
        var sq:Double=0.0
        when{
            (x>0&&y>0)-> println(sqrt(sin(x).pow(2)+cos(y.pow(3)).pow(2)))
            else-> println("Введите числа больше 0")
        }
    }
    catch (e: Exception) {
        println("Ошибка.Введите число")
    }

}

