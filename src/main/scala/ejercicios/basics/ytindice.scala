package ejercicios.basics

object ytindice {
  
    def yt(palabra: String) : String =  palabra match {
        case s if s.length > 1 && s.substring(1).startsWith("yt") => 
            s.replaceFirst("yt","")
        case _ => 
            palabra
    }

        // if (palabra.drop(1).startsWith("yt")) palabra.replaceFirst("yt", "")
        // else 
        //     palabra


    def main(args: Array[String]) : Unit = 
        println(yt("aytef"))
        println(yt("adadad"))
}
