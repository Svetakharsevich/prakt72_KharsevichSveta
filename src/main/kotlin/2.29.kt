fun main()
{
    try{
        println("Введите год")
        var N=readln().toInt()
        when{
            (N % 4 == 0)&&((N % 400 == 0)||(N % 100 != 0)) -> println("Год високосный")
            else -> println("Год не високосный")
        }
    }
    catch (e: Exception){
        println("Ошибка.Введите число")
    }

}

