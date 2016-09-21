

import java.util.Scanner;

public class Input
{

    public Input()
    {
    }

    /**
     * This method prompts the user to state how many rounds they would 
     * like to distinguish each match to be. It then returns that information
     * to the class that uses it.  
     * 
     * @return     numThrows; which is the number of throws to constitute a match. 
     */
    public int getNumThrows()
    {
        Scanner in = new Scanner(System.in);
        int numThrows = 0;
        int temporary = 0;

        if(in.hasNextInt()){
            temporary = in.nextInt();

            if(temporary >= 0 && temporary <= 100){
                numThrows = temporary;
            }
            else{
                getNumThrows();
            }
        }
        else{
            getNumThrows();
        }

        return numThrows;
    }

    /**
     * This method prompts the user to enter a throw, or to request for help
     * regarding the rules of the game, or how to play the game.
     * 
     * @return      char: 'r', char: 'p', or char: 's'.  
     *              r for rock, p for paper, and s for scissors.
     */
    public char getThrow()
    {
        //if(in.hasNext("r") || in.hasNext("p") || in.hasNext("s")
        //|| in.hasNext("rules") || in.hasNext("help"))
        Display display = new MainMenu();
        Scanner in = new Scanner(System.in);
        String stringThrow = "h";
        char charThrow = 'n';
        
        if (in.hasNext())
        {
            stringThrow = in.next().toLowerCase();
            
            if(stringThrow.equals("r")){
                charThrow = 'r';
            }
            else if(stringThrow.equals("p")){
                charThrow = 'p'; 
            }
            else if(stringThrow.equals("s")){
                charThrow = 's'; 
            }
            else if(stringThrow.equals("rules")){
                display.displayRules();
                charThrow = getThrow();
            }
            else if(stringThrow.equals("help")){
                display.displayHelp();
                charThrow = getThrow();
            }
            else {
                display.invalidSelection();
                display.displayHelp();
                charThrow = getThrow();
            }
        }
        else{
            charThrow = getThrow(); 
        }
        
        
        return charThrow;
    }
    
    
}