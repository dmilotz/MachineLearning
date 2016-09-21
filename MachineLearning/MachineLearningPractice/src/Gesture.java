

import java.lang.Character;

public class Gesture {
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
  
    
	private int gesture;

	public Gesture(int gesture) {
    		this.gesture = gesture;
	}
  
public Gesture(char c){
	gesture = Character.toLowerCase(gesture);
		if (c == 'r')
			gesture = 0;
		if(c == 'p')
			gesture = 1;
		if(c == 's')
			gesture =2;
		}

  
  
	public int getGesture() {
    		return gesture;
	}
    
}