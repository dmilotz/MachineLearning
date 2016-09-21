

public class RandomThrow extends GameIntelligence  {

  public Gesture getGesture(){ 
		return makeRandomMove();
	}
  
	public Gesture makeRandomMove(){
		int g1 = (int) Math.floor(Math.random()*3);
    		return new Gesture(g1);
	}

}
