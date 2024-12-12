fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    if(num1<num2){
        println("$num2 és major")
    }
    else if (num1==num2){
        println("iguals")
    }
    else {
        println("$num1 és major")
    }
}