package ejercicios.basics

object numerovalor100 {
  

    def comprobarnumeros100(num1: Int, num2: Int) : Int = 

        val puntoreferencia = 100

        // calcular resta de diferencia entre los dos números
        val distancianum1 = math.abs(num1 - puntoreferencia)
        val distancianum2 = math.abs(num2 - puntoreferencia)

        if (num1 == num2)
            0
        else 
            if (distancianum1 < distancianum2) distancianum1 else distancianum2


    def main(args: Array[String]) : Unit = 
        println(comprobarnumeros100(50, 60))
        println(comprobarnumeros100(40,40))
}
 