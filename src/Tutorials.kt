fun main(){
    println("Hello world!")
    var myVariable: Int = 10
    var anotherVariable = 5
    println(myVariable)
    myVariable=1
    println("The value of the variable is: $myVariable")
    println()
    println("The value of another variable is: $anotherVariable")
    println("The sum of the two variables are ${myVariable+anotherVariable}")
    val s = "This is a string!"
    println("The given string is: ${s.toUpperCase().reversed()}")
    println(myVariable==anotherVariable)

    val x=12
    val y=13
    if (x>y){
        println("Hello There")
    }else{
        println("how you doin?")
    }

    val arr = arrayOf("Hello", "Guys", "WhatsUp?")
    val arrLength = arr.size
    var i =0;

    while(i<arrLength){
        println(arr[i])
        i++
    }

    for (i in arr){
        println(i)
    }
}