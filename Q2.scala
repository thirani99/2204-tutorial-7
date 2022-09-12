object Q2 extends App{
  //create objects
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  println(" x-y-z : " + (x-y-z))
}

//Define Rational data type
class Rational(a:Int, b:Int){

  def numer = a
  def denom = b

  def neg = new Rational(-this.numer, this.denom) //function for get negative Rational number
  def +(that:Rational) = new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom) //function for add two rational numbrt
  def -(that:Rational) = this + that.neg //function for subtract

  override def toString = numer + "/" + denom //print the string
}
