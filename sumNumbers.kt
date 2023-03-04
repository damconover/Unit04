fun main() {
    print("Enter a positive nonzero integer value: ")
    val input = readLine()?.toIntOrNull()

    if (input == null || input <= 0) {
        println("Invalid input. Please enter a positive nonzero integer.")
        return
    }

    var sum = 0
    for (i in 1..input) {
        sum += i
    }

    println("The sum of all integers from 1 to $input is $sum.")
}
