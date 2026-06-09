class ParseNumber {

        fun parse() {
            print("Enter a number: ")
            val input = readLine()

            val number = input?.toIntOrNull()

            if (number != null) {
                println("Number entered: $number")
            } else {
                println("Invalid number")
            }
        }
    }

    fun main() {
        val parser = ParseNumber()
        parser.parse()
    }