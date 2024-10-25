import java.util.Scanner;

public class GameUI {
   Scanner in = new Scanner(System.in);
    private Scanner input;

    public GameUI(){
        
    }

    public String readUserGuess(){
       this.input = in.next();
       return input;
    }

   public static void displayResult(int attemptsLeft, String guess, String feedback){
      attemptsLeft = GameEngine.getAttemptsLeft();
      feedback = GameEngine.evaluateGuess();
      System.out.println("You have "+attemptsLeft+" attempts left.");
   }
}
