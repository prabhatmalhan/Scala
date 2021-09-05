package Animal_Info

object animalOps 
{
  def main(args: Array[String])
  {
    val obj = new Animal();
    println("Dog name : "+obj.dog_name);
    obj.speak();
    obj.start_running;
    obj.stop_running;
    obj.start_wagging_tail;
    obj.start_eating;
    obj.stop_eating;
    obj.stop_wagging_tail;
    
  }
}