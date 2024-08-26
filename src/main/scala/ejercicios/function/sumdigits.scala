package ejercicios.function
import scala.io.StdIn._

object sumdigits {
  
    def sumanumero(numero: String) : Int = {

        numero.map(_.asDigit).sum
    }


    //resultado ejercicio web
//      def sumOfDigits(n: Int): Int = {
//     var num = n
//     var sum = 0

//     while (num != 0) {
//       val digit = num % 10
//       sum += digit
//       num /= 10
//     }

//     sum
//   }
    def main(args: Array[String]) : Unit = 
        print("Inserte un número para calcular la suma de los digitos: ")

        val num = readLine()

        println("La suma es: " + sumanumero(num))
}
