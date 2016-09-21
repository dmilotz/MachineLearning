
import java.util.*;
import java.util.LinkedList;


public class SmartThrow extends GameIntelligence {
	private LinkedList<String> current = new LinkedList<String>();
	List<Result> rHistory = new ArrayList<Result>();
	List<String[]> patterns = new ArrayList<String[]>();
	List<String[]> dividedHistory = new ArrayList<String[]>();
	//ArrayList<String> allGestures = new ArrayList<String>();
	
	public SmartThrow(){
		rHistory = rps.history.getResults();

	}
	
	public String [] getAllGestures(){
		String [] history = new String[rHistory.size()*2];
		int i = 0;
		for(Result r: rHistory){
			if(i == history.length)
				break;
			history [i++] = r.getPlayerGesture();
			history [i++] = r.getCompGesture();
			}
		
		return history;
	}
	
	public void partitionCurrent(){
		String [] current = getCurrentPattern();
		patterns.add(current);
		for(int i = 5; i > 0; i--){
			int k = 4;
			if(i>0){
				String [] temp = new String[i]; 
				for(int j = i-1; j >0; j--){
					temp[j] = current[k--];
				}
				patterns.add(temp);
				patterns.add(temp);
				patterns.add(temp);
			}
			else
				break;

			}
		
	}

	public void appendPatterns(){
		String [] rps = new String[3];
		rps [0] = "r";
		rps[1] = "p";
		rps [2] = "s";		
		int i =3;
		for(String [] s: patterns){
			s[s.length -1] = rps[i%3];
			i++;
		}
	}
	public void setCurrentPattern(){
		for(Result r: rHistory){
			if(current.size()<2){
				current.add(r.getPlayerGesture());
				current.add(r.getCompGesture());
				
			}
			else{
				current.removeFirst();
				current.removeFirst();
				current.add(r.getPlayerGesture());
				current.add(r.getCompGesture());
			}
		}
		partitionCurrent();
		appendPatterns();
	}
	
	public String[] getCurrentPattern(){
		String [] pattern = (String[]) current.toArray();
		return pattern;
	}
	
  
  
  public Gesture getGesture () { // MS - implements abstract class. temporary.
    
    if (rps.history.getResults().size() > 4) {
      int th = makeSmartThrow();
      if (th != -1)
      { return new Gesture (th); }
    }
    
    RandomThrow r = new RandomThrow();
    return r.getGesture();
    
  }
  
	public int makeSmartThrow(){
  
		int r = 0;
		int p = 0;
		int s = 0;
		for(int i =2; i< 6; i++){
			ArrayList<String[]> dividedHistory = new ArrayList<String[]>();
			dividedHistory = getPartitions(i);
			for(String[] s1: patterns){
				for(String[]s2: dividedHistory ){
					if (s1 == s2){
						if (s1[s1.length-1].equalsIgnoreCase("r"))
							r++;
						else if(s1[s1.length-1].equalsIgnoreCase("p"))
							p++;
						else 
							s++;
					}
				}
			}
		}
		
		if(r>p && r>s)
			return 1;
		else if(p>r && p>s)
			return 2;
		else if(s>p && s>r)
			return 0;
		else 
			return -1;
	}
	
	
	public ArrayList<String[]> getPartitions(int partSize){
		String [] part = new String [partSize];
		String [] allThrows = getAllGestures();
		ArrayList<String[]> dividedHistory = new ArrayList<String[]>();
		int index = 0;
		while(index < allThrows.length -1){
			for(int i = 0; i < partSize; i++){
				if(index +i < allThrows.length -1){
					part[i] = allThrows[index + i];
					dividedHistory.add(part);
				}
				else
					break;
				}
			
			index = index + partSize;
		}
		return dividedHistory;
	}




}