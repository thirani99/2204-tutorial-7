object Q1 extends App{
  val a = new rational(2,9) //create a variable of Rational data type
  println(a)
  println("Negative value of the rational number : " + a.neg) //get negative

}

//Define Rational data type
class rational(x:Int, y:Int){

  def numer = x
  def denom = y

  def neg = new rational(-this.numer, this.denom) //function for get negative Rational number
  def +(that:rational) = new rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom) //function for add two rational numbrt
  def -(that:rational) = this + that.neg //function for subtract

  override def toString = numer + "/" + denom //print the string
}
