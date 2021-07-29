object twoNumberAddition2 {
  def main(args: Array[String])
  {
   // Calling the function
  
    println("Sum is: " + functionToAdd(23,53));
   }
  
  // declaration and definition of function
  
   def functionToAdd(a:Int, b:Int) : Int =
   {
  
     val sum:Int = a + b
    
     // returning the value of sum
     return sum
   }
}
