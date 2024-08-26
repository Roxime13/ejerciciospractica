package ejercicios.function
import scala.io.StdIn._

object perfectsquare {
  
    def cuadrado(num: Int) : Boolean = 
        val raiz = Math.sqrt(num)
        raiz == raiz.toInt

    def main(args: Array[String]) : Unit = 
        println("Introduce un número para comprobar si es un cuadrado perfecto")
        val numero = readLine().toInt
        val resultado = cuadrado(numero)

        if (resultado){
            println(s"$numero es un cuadrado perfecto")
        } else{
            println(s"$numero no es un cuadrado perfecto")
        }
}
