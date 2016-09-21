
 
public class User implements Player {

  private String name;
  private Gesture gesture;
  
  // Constructor
  public User () { name = "User"; }
  
  public User (char userSelection) { //p5
      name = "User";
      gesture = new Gesture(userSelection);
  }
      
  // Methods
  
    @Override
 public Gesture getPlayerGesture () { return gesture; } //p5
  
  
}