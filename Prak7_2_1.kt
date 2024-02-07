fun main () {
    try {
        println("Введите N")
        var N = readLine()!!.toInt()
        when {
            N%3==0-> println("$N Кратно трём")
            else -> println("$N Не кратно трём")
        }
    }catch (e:Exception) {}
}