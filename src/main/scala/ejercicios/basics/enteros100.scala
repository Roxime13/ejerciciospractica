package ejercicios.basics

object enteros100 {
  
    def comprobarnumeros(numero1: Int, numero2: Int) : Boolean = 

        numero1 >= 100 && numero1 <= 200 || numero2 >= 100 && numero2 <= 200


    def main(args: Array[String]) : Unit = 
        println(comprobarnumeros(120, 80))
        println(comprobarnumeros(101, 199))
        println(comprobarnumeros(80, 201))
}
