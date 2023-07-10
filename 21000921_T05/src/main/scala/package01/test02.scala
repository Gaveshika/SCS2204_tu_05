package package01

object test02 extends App{

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def GCD(p: Int, n: Int): Int = n match {
    case 0 => p
    case n if n > p => GCD(n, p)
    case _ => GCD(n, p % n)
  }

  def primeSeq(x: Int): Unit = {
    def printAllPrimes(i: Int): Unit = {
      if (i < x) {
        if (prime(i)) {
          println(i)
        }
        printAllPrimes(i + 1)
      }
    }

    printAllPrimes(2)

  }

  primeSeq(10)

}
