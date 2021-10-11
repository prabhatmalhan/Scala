

object LisLastPos {
  def main(args: Array[String]): Unit = {
    val lis = List(1,3,2,4,5,6,3,5,3,5,7,9,3,6,2,5,7,6);
    var key = scala.io.StdIn.readInt();
    var pos = scala.io.StdIn.readInt();
    println(lis.lastIndexOf(key,pos));
  }
}