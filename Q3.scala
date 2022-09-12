object Q3 extends App{
  var bank:List[account] = List()
  //append accounts to the bank list
  bank = bank :+ new account("199986512050",0001,60000) //idNo, AccountNo, balance
  bank = bank :+ new account("200086512050",0002,95500)
  bank = bank :+ new account("199986512276",0003,200000)
  bank = bank :+ new account("199986534765",0004,200000)

  println(bank)

  bank(1).transfer(bank(0),20000)   //transfer 20000 to 2nd acc to 1st acc
  println("After transfer money between account")
  println(bank)

}

class account(id:String, ac:Int, b:Double){
  val nic = id
  val accountNo = ac
  var balance = b


  def withdraw(a:Double) = this.balance - a  //function for withdraw money

  def deposit(a:Double) = this.balance + a  //function for deposit money

  def transfer (a:account, b:Double) = {  //function for transfer the money between accounts
    this.balance = this.balance - b
    a.balance = a.balance + b
  }

  //display the object values
  override def toString = "[ " + nic + " : " + accountNo + " : " + balance + " ]"
}
