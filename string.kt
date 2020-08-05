fun main() {
    val wordOne = "Modern"
    val wordTwo = "Concise"
    val wordThree = "Pragmatic"
    val wordFour = "Safe"

    val kotlin = """
        Kotlin is $wordOne
        kotlin is $wordTwo
        kotlin is $wordThree
        kotlin is $wordFour
    """.trimIndent()

    print(kotlin)

}