fun main() {
    print("Enter a string: ")
    val inputString = readLine() ?: ""

    print("Enter a character to count: ")
    val inputChar = readLine()?.getOrNull(0)

    if (inputChar == null) {
        println("Invalid input. Please enter a single character.")
        return
    }

    val count = inputString.count { it == inputChar }

    println("The character '$inputChar' appears $count times in the string '$inputString'.")
}
