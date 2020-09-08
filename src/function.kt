fun main(){
    sum(1, 10)
    var p = pow(2, 4)
    println("2 to the power 4 is $p")
}

fun sum(n1: Int, n2:Int){
    var sum=0
    println("The sum of values from $n1 to $n2 is:")
    for (i in n1..n2){
        sum+=i
    }
    println(sum)
}


fun pow(b: Int, p: Int): Int{
    var r = 1
    for (i in 1..p){
        r*=b
    }
    return r
}