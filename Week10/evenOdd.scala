

object evenOdd {
  def main(args: Array[String]): Unit = {
    val lis = List(1,4,2,3,5,7,6,9,8,11,13,16,12,19,18,21,23,22,24,30);
    var (a,b) = lis.partition(_%2==0);
    println("Even Nos :-");
    a.foreach(println);
    println("Odd Nos :-");
    b.foreach(println);
  }
}