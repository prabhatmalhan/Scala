

object PrintString {
  def main(args:Array[String])
  {
    val year = scala.io.StdIn.readInt();
    val name = scala.io.StdIn.readLine();
    
    val printToString=(name:String)=>println(s"We are students of $name"+s" and of batch $year");

   printToString("Graphic Era");
  }
}