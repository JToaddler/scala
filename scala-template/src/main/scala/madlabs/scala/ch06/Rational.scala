package madlabs.scala.ch06

import java.io.IOException
import java.io.FileNotFoundException
import java.io.FileReader

class Rational(n: Int, d: Int) {

  require(d != 0, "Denominator should be greater than 0")
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  println("Rational number : ")

  override def toString = numer + "/" + denom

  def +(that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer, denom * that.denom);

  def lessThan(that: Rational) = this.numer * that.denom < this.denom * that.numer

  def max(that: Rational) = if (this lessThan that) that else this

  def *(that: Rational) = new Rational(this.numer * that.denom, this.denom * that.numer)

  print(this) // this is still part of primary constructor -this not encouraged

  def this(n: Int) = this(n, 1)

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def *(i: Int) = new Rational(this.numer * i, this.denom)

  def /(i: Int) = new Rational(numer, denom * 1)

  def /(that: Rational): Rational = new Rational(numer * that.denom, denom * that.numer)

  def -(i: Int): Rational = new Rational(numer - i * denom, denom)

  def -(that: Rational): Rational = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  //implicit def intToRational(x: Int) = new Rational(x)
  def something() {
    try {
      val f = new FileReader("input.txt")
      // Use and close file
    } catch {
      case ex: IOException           => // Handle other I/O error
      case ex: FileNotFoundException => // Handle missing file
    }
  }
}