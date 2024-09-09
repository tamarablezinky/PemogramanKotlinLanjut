fun main(args: Array<String>) {
    //array
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arr8 = arrayOf<Int>()
    for (i in 1..10) {
        arr8 += i
    }
    for (i in arr8){
        print("$i")
    }
}