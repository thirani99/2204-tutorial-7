object Q4 extends App{
  var bank:List[Accounts] = List()
  //append accounts to the bank list
  bank = bank :+ new Accounts("199986512050",0001,60000) //idNo, AccountNo, balance
  bank = bank :+ new Accounts("200086512050",0002,95500)
  bank = bank :+ new Accounts("199986512276",0003,200000)
  bank = bank :+ new Accounts("199986534765",0004,200000)

  println(bank)


  val negativeBalance =  bank.filter((x:Accounts) => x.balance < 0)    //List of Accounts with negative balances
  printf("\nList of Accounts with negative balances : " + negativeBalance)


  val totalBalance:Double = bank.filter((x:Accounts) => x.balance != 0).map(bank => bank.balance).reduce((x,y)=>x+y) //Calculate the sum of all account balances
  printf("\n\nSum of all account balances : " + totalBalance)


  val totalWithInterest =  bank.map((x:Accounts) => if (x.balance>0) x.balance = x.balance * 1.5 else x.balance = x.balance * 1.1) //Calculate final balances of all accounts after apply the interest
  totalWithInterest
  printf("\n\nFinal balances with interest : " + bank)

}

class Accounts(e:String, f:Int, g:Double){
  val nic = e
  val accountNo = f
  var balance = g


  def withdraw(a:Double) = this.balance - a  //function for withdraw money

  def deposit(a:Double) = this.balance + a    //function for deposit money

  def transfer (a:Accounts, b:Double) = {  //function for transfer the money between accounts
    this.balance = this.balance - b
    a.balance = a.balance + b
  }

  //display the object values
  override def toString = "[ " + nic + " : " + accountNo + " : " + balance + " ]"
}
