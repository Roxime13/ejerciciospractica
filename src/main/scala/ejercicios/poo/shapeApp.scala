package ejercicios.poo

//como tiene clase anidada y proteger datos, es mejor hacerlo privado
class ShapeB{
    private var dimensions : Dimensions = _

    //un metodo para cambiar las dimensiones y crear el objeto Dimensions
    def setDimensions(width: Double,  height: Double): Unit = {
        dimensions = new Dimensions(width, height)

    }
    //un metodo para conseguir las definiciones
    def getDimensions: Dimensions = dimensions
    class Dimensions(val width: Double, val height: Double)
}

object shapeApp {
  def main(args: Array[String]): Unit = 
    val forma = new ShapeB()
    forma.setDimensions(15.0, 18.4)
    val dimensions = forma.getDimensions
    println(s"Width: ${dimensions.width}")
    println(s"Height: ${dimensions.height}")

}
