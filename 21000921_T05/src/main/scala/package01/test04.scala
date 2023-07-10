package package01

import scala.io.StdIn.readInt

object test04 {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1) //indirect recursion
  }

  def isOdd(n: Int): Boolean = !(isEven(n))


  def main(args: Array[String]): Unit = {
    print("Enter an integer : ")
    var n = readInt()
    var ans = isEven(n)

    if (ans == true) {
      println(+n+" is even")
    }
    else {
      println(+n+" is odd")
    }

  }

}
