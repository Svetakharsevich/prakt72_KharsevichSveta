fun main() {
    try {
        println("Введите три действительных числа")
        var a=readln().toDouble()
        var b=readln().toDouble()
        var c=readln().toDouble()
        when{
            (a>=1&&a<=3||b>=1&&b<=3||c>=1&&c<=3) -> println("Числa принадлежат отрезку [1;3]")
            else-> println("Ни одно из чисел не принадлежит отрезку [1;3]")
        }
    }
    catch (e: Exception){
        println("Ошибка.Введите число")
    }

}

