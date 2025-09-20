fun main(args: Array<String>){
    //Ranges
    val i: Int = 2
    for (j in 1..4)
        print(j) //print "1234"
    println()

    if (i in 1..10) { // equivqlent of 1 <= i && i <= 10
        println("we found your number --" + i)
    }
}