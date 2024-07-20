package ejercicios

import scala.collection.immutable.List

object average {
  def main(args: Array[String]): Unit = {
    val seq = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val promedio = calcularPromedio(seq)
    println(s"El promedio es: $promedio")
  }

  def calcularPromedio(numeros: List[Int]): Double = {
    val suma = numeros.sum
    val cantidad = numeros.size
    suma.toDouble / cantidad
  }
}






