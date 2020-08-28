fun main(){
    var n = readLine()
    var sum = 0
    if (n!=null){
        println("Enter $n numbers")
        for (i in 1..n.toInt()){
            var a = readLine()
            sum += a?.toInt()!!
        }
        var a = sum/n.toInt()
        println("Average = $a")
    }
}