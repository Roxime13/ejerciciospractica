package ejercicios.basics

object temperatures {
  
   def temperatura(temp1: Int, temp2: Int) : Boolean = 

        temp1 < 0 && temp2 > 100

    def main(args: Array[String]) : Unit = 
        println(temperatura(-3, 105))
        println(temperatura(5, 99))
        println(temperatura(-3, 50))
}
