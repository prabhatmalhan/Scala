class keywordDemo {
  object keywordsDemo 
  {
    def main(args: Array[String])
    {
      var condition:Boolean =true;
      var a:Int=0;
      do
      {
        try
        {
          a = scala.io.StdIn.readInt();
        }
        catch
        {
          case e: NumberFormatException=>
            {
              println("invalid input");
              return;
            }
        }
        val fact = findFact(a);
        printf("Factorial = %d",fact);
        println();
        print("do you want to enter another no. (y/n):");
        var c:Char = scala.io.StdIn.readChar();
        if(c=='n')
          condition=false;
      }while(condition);
      return;
    }
    
    def findFact(a:Int) : Int=
    {
      var f:Int=1;
      for(x <- 1 to a)
        f*=x;
      return f;
    }  
  }
}
