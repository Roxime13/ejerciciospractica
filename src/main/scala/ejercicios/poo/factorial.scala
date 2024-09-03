package ejercicios.poo

object MathUtils {
    def factorial(num: Int): BigInt = {

        if ( num == 0 || num == 1){
            1
        } else {
            num * factorial(num -1)
        }

    }


}

object factorialMain {

    def main(args: Array[String]) : Unit = {
        val numero1 = 11
        val resultado1 = MathUtils.factorial(numero1)
        println(s"El factorial del número $numero1 es: $resultado1")
        val numero2 = 25
        val resultado2 = MathUtils.factorial(numero2)
        println(s"El factorial del número $numero2 es: $resultado2")
    }
  
}
