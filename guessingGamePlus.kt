fun main() {
    val randomNumber = (1..100).random()

    println("Guess the random number between 1 and 100.")

    var guess: Int? = null
    var numGuesses = 0
    while (guess != randomNumber) {
        print("Enter your guess: ")
        guess = readLine()?.toInt()

        when {
            guess == null -> println("Invalid input. Please enter a number.")
            guess < randomNumber -> {
                println("Too low, try again.")
                numGuesses++
            }
            guess > randomNumber -> {
                println("Too high, try again.")
                numGuesses++
            }
            else -> {
                numGuesses++
                println("Congratulations! You guessed the number in $numGuesses guesses.")
            }
        }
    }
}
