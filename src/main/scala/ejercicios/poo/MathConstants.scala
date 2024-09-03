package ejercicios.poo

import ejercicios.poo.MathConstants.PI
import ejercicios.poo.MathConstants.E

object MathConstants {
  val PI = 3.14159
  val E = 2.71828
}

object MathMain{
    def main(args: Array[String]): Unit = 
        println(s"El valor de PI es: $PI")
        println(s"El valor de E es: $E")
}