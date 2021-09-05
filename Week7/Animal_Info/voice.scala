package Animal_Info

trait voice {
  var voice : String;
  
  def speak()
  {
    println(s"Animal start to $voice");
  }
}