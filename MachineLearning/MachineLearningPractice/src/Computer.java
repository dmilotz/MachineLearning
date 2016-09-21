


public class Computer implements Player {
	// Class fields
  private String name;
	private GameIntelligence ai;
	
  // Constructors
  public Computer (String name, String difficulty)
  { 
    this.name = name;
    ai = GameIntelligence.initialize(difficulty);
  }
	
	public Gesture getPlayerGesture() {
		return ai.getGesture();
	}
}