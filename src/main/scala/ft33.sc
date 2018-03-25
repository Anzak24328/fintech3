trait BankProducts {
  val name: String
  var balance: Int = 0

  def addMoney(sum: Int): Unit = this.balance = this.balance + sum
  def removeMoney(sum: Int): Unit =  this.balance = this.balance - sum
}

case class Debet() extends BankProducts {
  val name: String = "Депозит"
}

case class CreditCard() extends BankProducts {
  val name: String = "Кредитная карта"
}

case class DebetCard() extends BankProducts {
  val name: String = "Дебетовая карта"
}

var debet = new Debet()
debet.addMoney(10)
var creditCard = new CreditCard()
creditCard.removeMoney(15)
var debetCard = new DebetCard()
debetCard.addMoney(50)

val products: List[BankProducts] = List(debet, creditCard, debetCard)
val sumBalance = products.map(_.balance)
println(debetCard.name)

