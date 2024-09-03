package ejercicios.poo

class Persona(var name: String, var age: Int, var country: String){
    def getName : String = name

    //Metodos = Acciones que puede hacer el objeto. Ex: Correr, Saltar...
    //Propiedades = Caracteristicas del objeto. 

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

class Student(name: String, age: Int, country: String, var grade: String) //solo se pone var de los que se añaden que son en sí de esa clase y no se heredan
    extends Persona(name, age, country){
        def getGrade: String = grade
        def SetGrade(newGrade: String): Unit = {
            grade = newGrade
        }
    }

object studentClass {

    def main(args: Array[String]) : Unit = {
       val student = new Student("Andreas", 35, "México","1ESO")
        println(s"Nombre de la persona: ${student.name} ")
        println(s"Edad de la persona: ${student.age}")
        println(s"País de la persona: ${student.country}")
        println(s"Grado de la persona: ${student.grade}")

        student.SetName("Andreas") 
        student.SetAge(35)
        student.SetCountry("México")
        student.SetGrade("4ESO")

        println(s" \nNombre de la persona cambiado: ${student.getName}")
        println(s"Edad de la persona actualizado: ${student.age}")
        println(s"País de la persona actualizado: ${student.country}")
        println(s"Grado de la persona actualizado: ${student.grade}")
    }
}
