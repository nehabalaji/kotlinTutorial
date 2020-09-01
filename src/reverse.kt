fun main(){
    val list = mutableListOf<Int>()
    println("Enter 5 numbers")
    for (i in 0..4){
        val n = readLine()?.toInt()
        if (n!=null)
        list.add(n)
    }
    println("The numbers in reverse order are : ")
    for (i in 4 downTo 0){
        println(list[i])
    }
}