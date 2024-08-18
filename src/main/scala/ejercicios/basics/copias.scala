package ejercicios.basics

object copias {
  
    def copias(palabra: String ) : String = 
        val len = palabra.length
        val ultimo = palabra.charAt(len -1)
        ultimo + palabra + ultimo
 

    def main(args: Array[String]) : Unit = 
        println("Resultado: " + copias("hola"))
        println("Resultado: " + copias("murcierlago"))
        println("Resultado: " + copias("bu"))
}
