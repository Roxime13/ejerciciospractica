package ejercicios.function

object esprimo {
  
    def esPrimo(num: Int ) : Boolean = 
        if (num <= 1){
            false
        } else if (num == 2 || num == 3){
            true
        } else if (num % 2 == 0 || num % 3 == 0){
            false
        } else {
            var i = 5
            while ( i * i <= num){
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false
                }
                i += 6
            }
            true
        }


    def main(args: Array[String]) : Unit = 
        val numero = 29 // Puedes cambiar este valor para probar otros números.
        // Imprime el resultado indicando si el número es primo o no.
        println(s"¿Es $numero primo? ${esPrimo(numero)}")
}
