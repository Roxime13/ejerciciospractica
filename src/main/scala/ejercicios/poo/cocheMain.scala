package ejercicios.poo


class Car(make: String, model: String, year: Int){
    def carDetails(): Unit = {
        println("Información del coche: ")
        println(".......................")
        println(s"Marca: $make")
        println(s"Modelo: $model")
        println(s"Año: $year")
    }
}
object cocheMain {
  def main(args: Array[String]) : Unit = 
    val car = new Car("Mercedes", "Mercedes", 1991)
    car.carDetails()
}
