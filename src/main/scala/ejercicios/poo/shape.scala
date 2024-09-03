package ejercicios.poo

import java.awt.Rectangle

abstract class Shape {
    def area: Double
}

class Rectangle(width: Double, height: Double) extends Shape {
    override def area: Double = width * height
}
class Circle(radius: Double) extends Shape {
    override def area: Double = math.Pi * radius * radius
}

object main {
  def main(args: Array[String]) : Unit = {
    val rectangle = new Rectangle(5.5,15.5)
    println(s"El area del rectángulo es: ${rectangle.area}")

    val circulo = new Circle(13.5)
    println(s"El area de un círculo es: ${circulo.area}")
  }
  
}
