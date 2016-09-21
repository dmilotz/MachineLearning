

public class Round {
	// Class fields
	private User human;
	private Computer cpu;
	private Referee judge;
	
  public Round (String difficulty, char userGesture)
  {
    human = new User(userGesture);
    cpu = new Computer("CPU", difficulty);
    judge = new Referee ();
  }
  
    public Result playRound()
  {
    //System.out.println("");
    //System.out.println("****PLAYING A ROUND!*******");
    //System.out.println("");
    return judge.determineWinner( human.getPlayerGesture(), 
                                  cpu.getPlayerGesture() );
    
  }
  
}