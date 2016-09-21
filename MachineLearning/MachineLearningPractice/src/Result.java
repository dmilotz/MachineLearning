
public class Result {
	
	private String winner;
	private Gesture playerGesture;
	private Gesture compGesture;
	String rock ="Rock";
	String paper = "Paper";
	String scissors = "Scissors";
	
	public Result(String w, Gesture comp, Gesture player ){
		winner = w;
		playerGesture = player;
		compGesture = comp;
	}
	
	public String getWinner(){
		return winner;
	}
	
	public String getPlayerGesture(){
		if (playerGesture.getGesture() == 0) 
			return rock;
		else if(playerGesture.getGesture() == 1)
			return paper;
		else if(playerGesture.getGesture() == 2)
			return scissors;
		return null;
	}
	
	public String getCompGesture(){
		if (compGesture.getGesture() == 0) 
			return rock;
		else if(compGesture.getGesture() == 1)
			return paper;
		else if(compGesture.getGesture() == 2)
			return scissors;
		return null;
	}
	
}
