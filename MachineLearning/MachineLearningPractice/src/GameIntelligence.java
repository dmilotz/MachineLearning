
public abstract class GameIntelligence { 
   
  private static String smart = "smart";
  private static String random = "random";
  
  public GameIntelligence() {}
  
  
  public static GameIntelligence initialize (String difficulty) {
    
    if ( difficulty.compareToIgnoreCase(smart) == 0) {
      return new SmartThrow();
    }
    else if ( difficulty.compareToIgnoreCase(random) == 0 ) {
      return new RandomThrow();
    }
    else {
      return new RandomThrow();
    }
  }
  
	// Method Prototypes
	public abstract Gesture getGesture();
		
}