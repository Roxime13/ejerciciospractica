package ejercicios.basics

object intercambio {
  
    def intercambiar(palabra: String, pos1: Int, pos2: Int) : String = 
        val chars = palabra.toCharArray
        val temp = chars(pos1)
        chars(pos1) = chars(pos2)
        chars(pos2) = temp

        new String(chars)

    def main(args: Array[String]) : Unit = 
        println(intercambiar("sandra", 0, 5 ))
        println(intercambiar("angeles", 0, 6))
}
