fun main(args: Array<String>) {
    println ("Exponent calculator")
    println ("===================")
    println("enter the base:")
    val a= readLine()!!.toInt()
    println("enter the exponent:")
    val n = readLine()!!.toInt()
    var result = a
    for (i in 1..n-1) {
        result = result * a
    }
    println ("Result : $result")
    println ("Thank you for using exponent calculator")
    }

