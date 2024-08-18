package ejercicios.basics

object largestnumber {
  

    def calcularmayor(numeros: List[Int]) : String =


        if (numeros.isEmpty) 
            "La lista está vacía"
        else
            numeros.max.toString

    def main(args: Array[String]) : Unit = 
        println(calcularmayor(List(10,20,30)))
        println(calcularmayor(List()))
}
