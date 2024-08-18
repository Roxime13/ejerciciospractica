package ejercicios.basics

object integer20 {

    def estaDentro(numero: Int): Boolean = 
        (math.abs(100- numero) <= 20) || (math.abs(300 - numero) <= 20)

    def main(args: Array[String]) : Unit = {
        val numeros = List(100, 400, 50)

        for (numero <- numeros) {
            if (estaDentro(numero)) {
                println(s"$numero está dentro de 20 de 100 o 300")
            } else {
                println(s"$numero no está dentro de 20 de 100 o 300")
            }
        }
    }

}
