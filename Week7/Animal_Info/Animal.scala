package Animal_Info

class Animal extends Dog with voice with TailWagging with Running with Eating
{
  var dog_name : String = "Tuffy";
  var voice : String = "Bark";
  
  def start_wagging_tail
  {
    println("Wagging starts");
  }
  
  def stop_wagging_tail
  {
    println("Wagging ends");
  }
  
  def start_running
  {
    println("Running starts");
  }
  
  def stop_running
  {
	  println("Running ends");
  }
  
  def start_eating
  {
    println("Eating starts");
  }
  
  def stop_eating  
  {
	  println("Eating ends");
  }
}