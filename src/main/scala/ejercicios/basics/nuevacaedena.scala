package ejercicios.basics

def copiasnumero(cadena: String, n: Int, separador: String) : String = 
    if (n < 0 ){
        throw new IllegalArgumentException("El número de repeticiones no puede ser negativo")
    } else {
        List.fill(n)(cadena).mkString(separador) //hacer que la lista esté separada por un separador
    }
object nuevacaedena {
  def main(args: Array[String]) : Unit = 
    println(copiasnumero("Teresa", 3, " "))
    println(copiasnumero("Anastasia", -1, ","))
}
