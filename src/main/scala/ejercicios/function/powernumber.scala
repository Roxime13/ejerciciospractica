package ejercicios.function
import scala.io.StdIn._

object powernumber {
  
    def potencia(base: Int, exponente: Int) : Double = 
        Math.pow(base, exponente)

    def main(args: Array[String]) : Unit = 
        print("Escribe la base para calcular la potencia: ")
        val base = readLine().toInt
        print("Escribe el exponente para calcular la potencia: ")
        val exponente = readLine().toInt
        println(s"La potencia con base $base y exponente $exponente es: " +  potencia(base,exponente))
}
