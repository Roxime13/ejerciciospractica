package ejercicios.function

object maximoelemento {
  
    def maximo(array: Array[Int]) : Int = 

        if (array.isEmpty) {
            throw new IllegalArgumentException("El array está vacío")
        } else {
            array.max

        // con bucle
        //     var maxElement = arr(0)
        //     for (i <- 1 until arr.length) {
        //     if (arr(i) > maxElement) {
        //         maxElement = arr(i)
        //     }
        //     }
            
        //     maxElement
        // }
        }

    def main(args: Array[String] ) : Unit = 
        val array : Array[Int] = Array(1,2,3,4,5,10)
        println("Resultado: " + maximo(array))
}
