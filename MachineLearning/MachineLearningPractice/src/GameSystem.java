

public class GameSystem {

    /*
  public static void main (String [] args)
  {
    // Validate startup parameters
    if ( !validate(args) )
    {
      MainMenu mainMenu = new MainMenu();
      mainMenu.invalidStartupError();
      return;
    }
    
    // Parse command line input
    int numOfThrows = Integer.parseInt(args[0]);
    String difficulty = args[1];                                     
    
    // Proceed to running the application
    Input in = new Input ();
    run (in, numOfThrows, difficulty);
    
    System.out.println("Thank you for playing");
  }
  
  * 
  */
    
  //public static void run (int numOfThrows,                           
    public void run (int numOfThrows,                           
                          String difficulty)                         
  {
     
    boolean continuePlaying = true;
      
    // Play RPS
    while (continuePlaying) 
    {      
      // Play a match
      if (numOfThrows > 0)
      {
        Match m = new Match( numOfThrows, difficulty );
        //m.playMatch( ); //p5                                   
       // m.displayResults();
        
        // Terminate application at end of match                     
        continuePlaying = false;                                     
      }
      
      // DELETE IN ASSIGNMENT 5 - User has decided to exit game
      else
      { continuePlaying = false; }
    }
     
    
  }
  
  private static boolean validate (String [] args)
  {
    String random = "random";
    String smart = "smart";
    
      if (args.length == 2) { // valid number of arguments
        if ( (args[1].compareToIgnoreCase(random) != 0) && 
             (args[1].compareToIgnoreCase(smart) != 0) ) {
                return false;
        }
      }
      else 
      { return false; }

    return true;
  }
}