
fun main() {
    var input = readLine();
    val r = input?.reversed()
    if (input == r) {
        println("The given string $input is a palindrome")
    } else {
        println("The given string $input is not a palindrome")
    }
}
