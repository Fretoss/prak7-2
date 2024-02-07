fun main() {
    try {
        println("введите числа по порядку (5 чисел)")
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()
        var c = readLine()!!.toInt()
        var u = readLine()!!.toInt()
        var v = readLine()!!.toInt()
        var minValue = Int.MAX_VALUE
        var maxValue = Int.MIN_VALUE
        for (x in u..v) {
            var y = a * x * x + b * x + c
            if (y < minValue) {
                minValue = y
            }
            if (y > maxValue) {
                maxValue = y
            }
        }
        println("Минимальное значение функции на отрезке [$u, $v]: $minValue")
        println("Максимальное значение функции на отрезке [$u, $v]: $maxValue")
    }catch (e:Exception) {}
}