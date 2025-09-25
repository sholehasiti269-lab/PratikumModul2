fun main(args: Array<String>){
    //elvis operator ?:
    var maybeWelcome: String? = "Hello world"
    println(maybeWelcome?.length ?: 0)
}