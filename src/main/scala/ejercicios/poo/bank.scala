package ejercicios.poo

class BankAccount(var accountNumber: String, var balance: Double){

    def deposit(amount: Double) : Unit = {
        balance += amount
        println(s"La cuenta ahora es: $balance")
    }
    def withDraw(amount: Double) : Unit = {
        if (amount <= balance){
            balance -= amount
            println(s"La cuenta es de: $balance")
        } else {
            println(s"Quieres quitar dinero? Hay insuficiente dinero")
        }
    }
}

object mainBank {
    def main(args: Array[String]) : Unit = 
        val account = new BankAccount("1231B209183", 5000.15)
        println(s"Número de cuenta: ${account.accountNumber}" )
        println(s"El balance es: ${account.balance}")

        account.deposit(100)
        account.withDraw(4000)
        account.withDraw(2000)
  
}
