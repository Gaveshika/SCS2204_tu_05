package package01

import scala.io.StdIn.readInt

object test03{
  var sum = 0;
  var x = 1;

  def print_sum(y :Int) : Any = {
    if(x<=y){
      sum = sum+x;
      x = x+1;
      print_sum(y);
    }
    else{
      print(sum);
    }

  }

  def main (args : Array[String]): Unit = {
    print("Enter a value for y : ");
    var y = readInt();
    print_sum(y);
  }

}
