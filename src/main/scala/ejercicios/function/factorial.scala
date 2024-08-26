package ejercicios.function

object factorial {

    def encontrarfactorial(num: Int) : Int = 

    if (num <= 1) {
        1
    } else {
        num * encontrarfactorial(num - 1)
    }

  
    def main(args: Array[String]) : Unit = 
        println("Resultado: " + encontrarfactorial(6))
        println("Resultado: " + encontrarfactorial(0))
}
