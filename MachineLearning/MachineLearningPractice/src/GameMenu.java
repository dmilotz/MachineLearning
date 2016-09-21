
public class GameMenu extends Display
{

    public GameMenu()
    {
    }

 
    public void displayGetNumThrow()
    {
        System.out.println("\n~Please enter a number between 1 and 100 to "
            +"constitute the \n~number of throws in a match (Enter 0 to Exit):  ");

    }

    /**
     * displayNumThrowInputRangeError is a method that displays an error 
     * in regard to the input recieved for the range of the size of the match 
     * 
     */
    public void displayNumThrowInputRangeError()
    {
        System.out.println("\nError: Number of throws entered is not within an appropriate"
            + "\nrange of rounds for a match.");
    }

    /**
     * displayNumThrowInputTypeError is a method that specifies what the input 
     * should be.
     * 
     * 
     */
    public void displayNumThrowInputTypeError()
    {
        System.out.println("\nError: Input needs to be an integer between 1 and 100.");
    }

    /**
     * displayNumThrowInputRequest is a method that prompts the user for a throw choice.
     * 
     */
    public void displayNumThrowInputRequest()
    {
        System.out.println(
            "\n~To request help in regard to the rules of this game,\n~please enter 'rules'. "
            +"To request help in regard to \n~how to play this game, please enter 'help'."
            +"\n~Please enter your 'throw' choice for this round: \n");
    }
    
    
    
}