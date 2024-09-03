package ejercicios.poo


class ContactInfo(var name: String, var email: String, var address: String)

class Customer(val contactInfo: ContactInfo) // objeto en el que se guarda la info de ContactInfo
// para recuperarlo desde la class Customer a partir del val customer


object ContactApp {
  def main(args: Array[String]): Unit = 
    val cliente = new ContactInfo("Mikael", "mikead@hotmail.com", "C/ en alguna parte nº 12")
    val customer = new Customer(cliente)
    println("Datos del cliente ")
    println(s"Nombre del cliente:  ${customer.contactInfo.name}")
    println(s"Email del cliente: ${customer.contactInfo.email}")
    println(s"Dirección del cliente: ${customer.contactInfo.address}")
}
