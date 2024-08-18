package ejercicios.basics

object newstring {
  
    def  ife(palabra: String) : String = 
       if (palabra.startsWith("if")) {
            // Si ya comienza con "if", devolver la cadena sin cambios
            palabra
       } else {
         "if " + palabra
         //sino añadir if delante
       }

    def main(args: Array[String]) : Unit =
        println(ife("The cats were eating"))
        println(ife("if the videogame ended in game over"))
}
