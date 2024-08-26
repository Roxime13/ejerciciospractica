package ejercicios.function

object reversestring {
  
    def stringreverse(palabra: String) : String = 

        palabra.reverse

    def main(args: Array[String]) : Unit = 
        val palabra = "Sandra"
        val resultado = stringreverse(palabra)
        println(s"La palabra $palabra al revés es: " + stringreverse(palabra))
}
