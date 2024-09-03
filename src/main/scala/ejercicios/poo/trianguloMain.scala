package ejercicios.poo

class Triangle(side1: Double, side2: Double, side3: Double){
    def isEquilateral(): Boolean = {
        side1 == side2 && side2 == side3
    }
}

object trianguloMain {
  def main(args: Array[String]) : Unit = 
    val triangulo1 = new Triangle(6.0,8.0,7.0)
    val triangulo2 = new Triangle(5.0,5.0,5.0)

    println(s"El triángulo es equilateral?: ${triangulo1.isEquilateral()}")
    println(s"El triángulo es equilateral?: ${triangulo2.isEquilateral()}")
}
