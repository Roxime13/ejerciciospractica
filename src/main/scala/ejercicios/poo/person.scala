package ejercicios.poo

class Person(var name: String, var age: Int, var country: String){
    def getName : String = name

    //Metodos = Acciones que puede hacer el objeto. Ex: Correr, Saltar...
    //Propiedades = Caracteristicas del objeto. Ex: longitud color, color ojos...

    def SetName(newName: String) : Unit = {  // Unit por cada definicion de posibilidad cambio de nombre
        name = newName //no poner val
    }

    def SetAge(newAge: Int) : Unit = {
        age = newAge
    }

    def getAge : Int = age

    def SetCountry(newCountry: String) : Unit = {
        country = newCountry
    }

    def getCountry: String = country

}

object PersonGroup {
  
    def main(args: Array[String]) : Unit = 
        val person = new Person("Mike",41, "United States")

        println(s"Nombre de la persona: ${person.name} ")
        println(s"Edad de la persona: ${person.age}")
        println(s"País de la persona: ${person.country}")

        person.SetName("Andreas") 
        person.SetAge(35)
        person.SetCountry("México")
        println(s" \nNombre de la persona cambiado: ${person.getName}")
        println(s"Edad de la persona actualizado: ${person.age}")
        println(s"País de la persona actualizado: ${person.country}")

}
