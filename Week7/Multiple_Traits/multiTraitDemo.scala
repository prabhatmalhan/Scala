package Multiple_Traits

object multiTraitDemo 
{
  def main(args: Array[String])
  {
    val demoClassObj = new DemoClass();
    demoClassObj.abstractMethod
    demoClassObj.nonAbstractMethod
  }
}