package ejercicios.basics

def upperCase(palabra: String) : String = palabra match {

    case s if s.length > 4 =>
        s.dropRight(4) + s.takeRight(4).toUpperCase //obtiene todos menos los ultimos cuatro caracteres
        //takeRight toma los 4 últimos y en este caso los pone en mayúscula
    case _ =>
        palabra.toUpperCase

    //otra solución
     //str1.take(str1.length() - 4) + str1.drop(str1.length() - 4).toUpperCase()
     //obtiene la longitud de cadena y se toma todos los caracteres menos los ultimos 4 caracteres
     //str1.drop(n) elimina los primeros `n`caracteres de la cadena y devuelve el resto. En este caso, 
     //elimina los primeros str1.length -4 caracteres
     //Es decir, str1.take(str1.length() -4) coge la cadena excepto los 4 últimos y 
     //str1.drop(str1.length() -4).toUpperCase() convierte las ultimas 4 en mayúsculas
}
object last4caractersuppercase {
  def main(args: Array[String]) : Unit = 
    println(upperCase("bienvenido"))
    println(upperCase("hola"))
    println(upperCase("holacaracola"))
}
