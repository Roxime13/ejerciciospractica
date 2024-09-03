package ejercicios.basics

def caracter(palabra: String, caracter : Char) : Boolean = 

    var veces = 0

    for( i <- palabra){
        if(i == caracter){
            veces += 1
        } 
    }

     veces >= 2 && veces <= 4

object character {
  def main(args: Array[String]) : Unit = 
    println(caracter("banana", 'a'))
    println(caracter("platano", 'o'))
}
