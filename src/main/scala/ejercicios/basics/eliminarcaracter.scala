package ejercicios.basics

import ejercicios.basics.prueba.numeros


object eliminarcaracter {
  
    def eliminarcaracter(palabra: String, numero: Int) : String = 
        
        palabra.take(numero) + palabra.drop(numero +1)
        //coger numero para con drop quitar ese y poner el resto de la palabra directamente

    def main(args: Array[String]) : Unit = 
        println(eliminarcaracter("hola", 3))
        println(eliminarcaracter("bienvenido", 4))
}
