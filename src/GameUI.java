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

   public String displayResult(int attemptsLeft, String guess, String feedback){
      return "You have "+attemptsLeft+" attempts left. \n Your guess: "+guess "\n Feedback: "+feedback;
   }

   public String displayWin(){
      return "Congratulations, YOU WIN!";
   }

   public String displayLoss(String targetWord){
      return "Game over! The word was: "+targetWord;
   }
}
