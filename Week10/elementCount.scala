

object elementCount {
  def main(args: Array[String]): Unit = {
    val lis = List(1,3,2,4,5,6,3,5,3,5,7,9,3,6,2,5,7,6);
    val s = lis.toSet;
    for(i<-s)
       println(i+" -> "+lis.count(_==i));       
  }
}