package ejercicios.basics

import scala.compiletime.ops.boolean

object prueba {


def main(args: Array[String]) : Unit =  {

    println(numeros(27, 30))
    println(numeros(10,10))
    println(numeros(20,10))

}

def numeros(num1: Int, num2: Int) : Boolean = {
    if (num1 == 30 || num2 == 30) {
        true
    } else {
        val sum = num1 + num2
        sum == 30
    }
}

}

