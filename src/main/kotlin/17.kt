fun main() {
    try {
        println("Введите коррдинаты первой точки x1 и y1")
        var x1 = readln().toDouble()
        var y1 = readln().toDouble()
        println("Введите коррдинаты второй точки x2 и y2")
        var x2 = readln().toDouble()
        var y2 = readln().toDouble()
        println("Введите целые числа N1 И N2")
        var N1 = readln().toInt()
        var N2 = readln().toInt()
        var L=N1/N2
        var x=(x1+L*x2)/(1+L)
        var y=(y1+L*y2)/(1+L)
        println("Координаты точек (${x};${y})")
    }
    catch (e: Exception) {
        println("Ошибка.Введите число")
    }
}

