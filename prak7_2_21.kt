import kotlin.math.*
fun main () {
    try {
        println("введите x,y")
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()
        var result = when {
            x < 0 -> "Точка находится вне заданной области"
            x < 1 -> {
                var znach = x * x + 3 * x + 4
                if (y < znach) "Точка принадлежит заштрихованной части"
                else "Точка находится вне заштрихованной части"
            }
            else -> {
                var znach = x + 7
                if (y < znach) "Точка принадлежит заштрихованной части"
                else "Точка находится вне заштрихованной части"
            }
        }
        println(result)
    } catch (e:Exception) { println("Неверный формат")}
}