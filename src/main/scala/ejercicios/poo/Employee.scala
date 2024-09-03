package ejercicios.poo

class Employee(name: String, age: Int, designation: String){
    def employeeDetails(): Unit = {
        println("Detalles empleado: ")
        println(s"Nombre: $name")
        println(s"Edad: $age")
        println(s"Designación: $designation")
    }
}

object employedMain{
    def main(args: Array[String]) : Unit = 
        val employee = new Employee("Maria Angéles", 56, "Administrativa" )
        employee.employeeDetails()
}
