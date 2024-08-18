package ejercicios.basics

object scornot {
    
    def sc(palabra: String) : Boolean = 
        
        palabra.startsWith("Sc")

    def main(args: Array[String]) : Unit = 
        println(sc("Scala"))
        println(sc("Python"))
}
