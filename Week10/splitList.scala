

object splitList {
  def main(args: Array[String]): Unit = {
    val lis = List(1,3,2,4,5,6,3,5,3,5,7,9,3,6,2,5,7,6);
    println("Odd Nos : "+lis.filter(_%2!=0));
    println("Split list as multiple of 3 : "+lis.partition(_%3==0));
    println("Split at multiple of 5 :" + lis.takeWhile(_%5!=0));
    println("Split at even returning lists : "+lis.span(_%2!=0));
  }
}