package ejercicios.basics

object variosnumeros2050 {
  
    def tresnumeros(num1: Int, num2: Int, num3: Int) : Boolean =

        num1 >= 20 && num1 <= 50 || num2 >= 20 && num2 <= 50 || num3 >= 20 && num3 <= 50


    def main(args: Array[String]) : Unit =
        println(tresnumeros(23, 19, 40))
        println(tresnumeros(19,19,19))
        println(tresnumeros(35, 23, 49))
}
