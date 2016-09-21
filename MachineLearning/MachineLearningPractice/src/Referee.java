
public class Referee {
	// Fields
	
	// Method Prototypes
	public Result determineWinner(Gesture play, Gesture comp){//alter result instantiation
		if(comp.getGesture() == play.getGesture()){
			return new Result("tie", comp, play);
		}else if(comp.getGesture()==0 && play.getGesture()==2){//rock vs. scissors
			return new Result("computer", comp, play);
		}else if(comp.getGesture()==1 && play.getGesture() ==2){
			return new Result("player", comp, play);
		}else if(comp.getGesture()==2 && play.getGesture() ==1){
			return new Result("computer", comp, play);
		}else if(comp.getGesture()==0 && play.getGesture() ==1){
			return new Result("player", comp, play);
		}else if(comp.getGesture()==1 && play.getGesture() ==0){
			return new Result("computer", comp, play);
		}else if(comp.getGesture()==2 && play.getGesture() ==0){
			return new Result("player", comp, play);
		}
		return null;
	}
}