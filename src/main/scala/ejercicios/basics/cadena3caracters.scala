package ejercicios.basics

object cadena3caracters {
  
    def nuevacadena(palabra: String ) : String = 
        
       if (palabra.length < 3) 
        palabra * 3
       else
        palabra.substring(0,3) + palabra + palabra.substring(0, 3)

    def main(args: Array[String]) : Unit = 
        println(nuevacadena("hola"))
        println(nuevacadena("blandiblu"))
        println(nuevacadena("videojuegos"))
        println(nuevacadena("hol"))
}
