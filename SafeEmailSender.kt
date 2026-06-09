class SafeEmailSender {


    fun sendEmail() {
        print("Enter email address: ")
        val email = readLine()

        if (!email.isNullOrBlank()) {
            println("Email sent to $email")
        } else {
            println("Invalid email address")
        }
    }
}

    fun main() {
        val sender = SafeEmailSender()
        sender.sendEmail()
    }

