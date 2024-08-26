package ejercicios.function
import scala.io.StdIn._

object Palindrome {

    def espalindromo(frase: String): Boolean = {
        val frasereves = frase
        frasereves.reverse
        frase.match {
            case s if frasereves == frase => true
            case _ => false
        }

        //ejemplo reducido sin match
        // val frasereves = frase.reverse
        // frasereves == frase
    }

    def main(args: Array[String]): Unit = {
        println("Escribe una frase para ver si es palíndromo o no: ")
        val frase = readLine()

        val resultado = espalindromo(frase)
        println("El resultado es: " + resultado)
    }
}

