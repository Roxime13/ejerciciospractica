package ejercicios.poo

case class Point(val x: Double, val y: Double)
        
        

object pointMain {
    def main(args: Array[String]): Unit = {
        val coordenadas = new Point(15.46, 35.0)
        val Point(xCoord, yCoord) = coordenadas

        println(s"x: $xCoord, y: $yCoord")
    }
        
}
