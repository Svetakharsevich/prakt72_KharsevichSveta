fun main()
{
    try{
        println("Введите три числа")
        var a=readln().toDouble()
        var b=readln().toDouble()
        var c=readln().toDouble()
        val numbers = listOf(a, b, c)
        println(numbers.sorted().reversed())
    }
    catch (e: Exception){
        println("Ошибка.Введите число")
    }

}

