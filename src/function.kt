fun main(){
    sum(1, 10)
}

fun sum(n1: Int, n2:Int){
    var sum=0
    println("The sum of values from $n1 to $n2 is:")
    for (i in n1..n2){
        sum+=i
    }
    println(sum)
}