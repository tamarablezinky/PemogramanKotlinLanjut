fun main(args: Array<String>) {
    //continue & break label
    println("Example og break and continue label")
    myLabel@ for (x in 1..10){
        if (x == 5 ){
            println ("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel //specifing the label
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}

