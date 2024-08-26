package ejercicios.function

object par {
  
    def parono(num: Int) : Boolean = 
        
        num % 2 == 0

    def main(args: Array[String]) : Unit = 
        // val numero = 4
        val numero = 9
        println(s"El número $numero es par?:  " + parono(numero))
}
