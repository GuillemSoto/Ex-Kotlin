/*AirVolumeCalculator

Per poder fer un estudi de la ventilació d'una aula necessitem poder
calcular la quantitat d'aire que hi cap en una habitació. Llegeix les 3
dimensions de l'aula i printa per pantalla quin volum té.*/

fun main() {
    val b = readln().toInt()
    val h = readln().toInt()
    val p = readln().toInt()
    println(b*h*p)
}