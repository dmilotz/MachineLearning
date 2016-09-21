

public abstract class Display
{
    // instance variables - replace the example below with your own

    /**
     * This method displays the rules of the game to the user.  It
     * then prints and returns the user to the last prompt that 
     * was given before the user requested help.
     * 
     */
    public void displayRules()
    {
        String rules = ("Blahh");
    }
    

    public void displayHelp()
    {
        System.out.println(
        "Blah");
    }
    
    public void invalidStartupError()
    {
        System.out.println("");
        System.out.println("Invalid startup");
        System.out.println("");
        System.out.println("  java GameSystem <Rounds per match> <Difficulty Level>");
        System.out.println("");
        System.out.println("    Rounds per match -- The number of rounds you would like to play (e.g. 5)");
        System.out.println("    Difficulty Level -- Enter \"random\" for easy, or enter \"smart\" for hard.");
        System.out.println("");
    }
    
    public void invalidSelection()
    {
        System.out.println("");
        System.out.println("Invalid selection.  Please try again.");
        System.out.println("");
    }
}