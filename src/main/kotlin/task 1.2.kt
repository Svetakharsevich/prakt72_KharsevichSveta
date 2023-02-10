fun main() {
    try {
        println("Введите номер элемента прогрессии m")
        var m = readln().toInt()
        println("Введите номер элементa прогрессии n")
        var n = readln().toInt()
        println("Введите значения элементов")
        var am = readln().toDouble()
        var an = readln().toDouble()
        var s: Double = 0.0
        when {
            (m < n) -> println((am + an) * (n - m + 1) / 2)
            else -> println("Введите число m меньше n")
        }
    }
     catch (e: Exception) {
         println("Ошибка.Введите число")
     }

}
