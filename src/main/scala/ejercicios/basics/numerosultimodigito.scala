package ejercicios.basics


def comprobarnumeros(num1: Int, num2: Int) : Boolean = 
    num1 % 10 == num2 % 10 //% 10 da el ultimo digito
object numerosultimodigito {
  def main(args: Array[String]) : Unit = 
   println(comprobarnumeros(1980, 7890)) 
    println(comprobarnumeros(571, 672))     
    println(comprobarnumeros(1267, 2299))   
}
