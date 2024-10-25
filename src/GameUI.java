import java.util.Scanner;

public class GameUI {
   Scanner in = new Scanner(System.in);
    private Scanner input;

    public GameUI(){
        input = new Scanner(System.in);
    }

    public String readUserGuess(){
       return input;
    }

   public static void displayResult(int attemptsLeft, String guess, String feedback){
      return "You have "+attemptsLeft+" attempts left. \n Your guess: "+guess+
   }
}
