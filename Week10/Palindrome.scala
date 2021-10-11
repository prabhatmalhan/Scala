

object Palindrome {
  def main(args: Array[String]): Unit = {
    var s = scala.io.StdIn.readLine();
    var ns="";
    for(i<-s)
      ns=i+ns;
    if(s.equalsIgnoreCase(ns))
      println("Palindrome");
    else
      println("Not Palindrome");
  }
}