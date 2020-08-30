fun main(){
    val list = mutableListOf<Int>()
    println("Enter 5 numbers")
    for (i in list){
        val n = readLine()?.toInt()
        if (n!=null)
        list.add(n)
    }
    println("The numbers in reverse order are : ")
    for (i in list[4] downTo list[0]){
        println(i)
    }

}