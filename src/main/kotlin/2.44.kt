import kotlin.math.min
fun main()
{
    try{
        println("Введите количество пропусков студентов в трех группах")
        var N1 = readln().toInt()
        var N2 = readln().toInt()
        var N3 = readln().toInt()
        var list= listOf(N1,N2,N3)
        val ints = list.toList()
        when{
            (ints.min()<10)-> println("Есть хорошая группа")
            else-> println("Нет хорошей группы")
        }
    }
    catch (e: Exception){
        println("Ошибка.Введите число")
    }

}

