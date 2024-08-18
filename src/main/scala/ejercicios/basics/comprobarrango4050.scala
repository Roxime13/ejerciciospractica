package ejercicios.basics


def estaEnRango(num: Int, min: Int, max: Int) : Boolean = 
    num >= min && num <= max

def comprobarNumerosRango(num1: Int, num2: Int) : Boolean = 
    (estaEnRango(num1, 20, 30) && estaEnRango(num2, 20, 30)) || 
    (estaEnRango(num1, 50, 60)) && estaEnRango(num2, 50, 60)

object comprobarrango4050 {

    def main(args: Array[String]) : Unit = 
        println(comprobarNumerosRango(21, 29))
        println(comprobarNumerosRango(50, 55))
        println(comprobarNumerosRango(1,10))
    
}
