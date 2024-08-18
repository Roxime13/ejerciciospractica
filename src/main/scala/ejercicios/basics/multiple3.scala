package ejercicios.basics

object multiple3 {
  

    def multiple(numero : Int) : String = 
        
        if (numero % 3 == 0){
            s"$numero es múltiple de 3"
        } else if (numero % 7 == 0 ){
            s"$numero es múltiple de 7"
        } else {
            s"$numero no es múltiple de 3 ni de 7"
        }
    

    def main(args: Array[String]) : Unit = 
        println(multiple(9))
        println(multiple(4))
        println(multiple(27))
}
