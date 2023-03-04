fun main() {
    val sales = IntArray(5)
    val storeNames = arrayOf("Store 1", "Store 2", "Store 3", "Store 4", "Store 5")

    for (i in 0 until 5) {
        print("Enter today's sales for ${storeNames[i]}: ")
        sales[i] = readLine()?.toInt() ?: 0
    }

    println("\nSALES BAR CHART")

    for (i in 0 until 5) {
        print("${storeNames[i]}: ")
        repeat(sales[i] / 100) {
            print("*")
        }
        println()
    }
}
