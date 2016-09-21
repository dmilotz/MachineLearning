

import java.util.ArrayList;

public class Match {
	//public static ResultsHistory history = new ResultsHistory();
	private int roundsPerMatch;
	private int roundsPlayed;
        
        private String difficulty;
        
	public Match(int rounds, String difficulty){
		roundsPerMatch = rounds;
                this.difficulty = difficulty;
                roundsPlayed = 0;
	}
	
	public String getDifficulty () { return difficulty; }	
	
        public void playMatch(char userGesture, ResultsHistory history){ // p5
            
            // Play a single round
            Round rnd = new Round( difficulty, userGesture ); //p5
            history.addResult(rnd.playRound());
            roundsPlayed++; //p5
            
	}
	
        public boolean getMatchProgress () {
            
            if (roundsPerMatch == roundsPlayed) 
            {return true; }
            
            return false;
        }
        
        
        
	
        
	
}
