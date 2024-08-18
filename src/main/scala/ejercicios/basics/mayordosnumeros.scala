package ejercicios.basics

def mayor(num: Int, min: Int, max: Int) : Boolean = 

   num >= min && num <= max

def mayornumerorango (num1: Int, num2: Int) : Int = 
    
    if (mayor(num1, 20, 30) && mayor(num2, 20, 30)) then 
        math.max(num1,num2)
    else 
        0

object mayordosnumeros {
  def main(args: Array[String]) : Unit = 
    println(mayornumerorango(22,27))
    println(mayornumerorango(29,21))
    println(mayornumerorango(15,20))
    println(mayornumerorango(15,17))
}
