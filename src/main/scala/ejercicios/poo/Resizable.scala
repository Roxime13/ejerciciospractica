package ejercicios.poo

trait Resizable {
  def resize(size: Int): Unit
}

class Rectangl(var width: Int, var height: Int) extends Resizable{
    override def resize(size: Int) : Unit = {
        width = size
        height = size
    }
    override def toString: String = s"Rectangle (width: $width, height: $height)"
}

object ResizableMain{
   def main(args: Array[String]) : Unit = {
    val rectangle = new Rectangl(6,10)

    rectangle.resize(14)
   }

}
