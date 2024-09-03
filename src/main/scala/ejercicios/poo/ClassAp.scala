package ejercicios.poo

// Definición del enum Color
//Si es Scala 2, no está enum y se debe usar sealed trait y case object en ese caso
enum Color {
  case Red, Green, Blue
}

// Object con el método para imprimir el color
object COLORClass {
  def printColor(color: Color): Unit = color match {
    case Color.Red    => println("El color es Red")
    case Color.Green  => println("El color es Green")
    case Color.Blue   => println("El color es Blue")
    
  }
}

object ClassApp {
  def main(args: Array[String]): Unit = {
  
    val red: Color = Color.Red

    COLORClass.printColor(red)
  }
}

//caso sealed trait
// sealed trait Color
// case object Red extends Color
// case object Green extends Color
// case object Blue extends Color
// case object Orange extends Color

// object ColorApp {
//   def main(args: Array[String]): Unit = {
//     val myColor: Color = Red
//     //val myColor: Color = Blue
//     printColor(myColor)
//   }

//   def printColor(color: Color): Unit = color match {
//     case Red   => println("The color is Red.")
//     case Green => println("The color is Green.")
//     case Blue  => println("The color is Blue.")
//     case Orange  => println("The color is Orange.")
//     case _     => println("Unknown color.")
//   }
// }