package ejercicios.function

object listaordenar {
  
    def ordenarlista(lista: List[Int]) : Boolean = {
        
       lista == lista.sorted
    }

    def main(args: Array[String]) : Unit = 
        val lista : List[Int] = List(1,2,3,4,5,6)
        val lista2: List[Int] = List(6,5,4,3,2,1)
        println("Lista ordenada?: " + ordenarlista(lista))
        println("Lista ordenada?: " + ordenarlista(lista2))
}
