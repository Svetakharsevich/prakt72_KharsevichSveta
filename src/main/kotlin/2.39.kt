import kotlin.math.pow
import kotlin.math.sqrt
fun main() {try{
        println("Введите k и b")
        var k = readln().toDouble()
        var b = readln().toDouble()
        println("Введите c,d,e числа")
        var c = readln().toDouble()
        var d = readln().toDouble()
        var e = readln().toDouble()
        when{
            (k>0||b<0||k<0||b>0)-> println("${c}*x^2+(${d-k})*x+(${e-b})=0")
            else-> println("Вы вели неправильные значения")
        }
        var discriminant=(d-k).pow(2)-4*c*(e-b)
        val x1=(-(d-k)+ sqrt(discriminant)/(2*c))
        val x2=(-(d-k)- sqrt(discriminant)/(2*c))
    val y1=k*x1+b
    val  y2=k*x2+b
         when{
             (discriminant>1)-> println("(${x1};${y1})(${x2};${y2})")
             (discriminant==0.0)-> println("(${x1==(-(d-k)/(2*c))};${y1})")
             else-> println("Не имеет корней")
         }
    }
    catch (e: Exception){
        println("Ошибка.Введите число")
    }
}


