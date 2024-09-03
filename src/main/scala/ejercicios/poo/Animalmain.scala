package ejercicios.poo

class Animal(var name: String, var sound: String){
    def makeSound() : Unit = {
        println(s"El $name hace  $sound")
    }
}

object Animalmain {
  def main(args: Array[String]) : Unit = {
    val gato = new Animal("Gato","miau")
    val perro = new Animal("Perro", "guau")
    gato.makeSound()
    perro.makeSound()
  }
    
}
