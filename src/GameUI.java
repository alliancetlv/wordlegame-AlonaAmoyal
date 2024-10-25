import java.util.Scanner;

public class GameUI {
   Scanner in = new Scanner(System.in);
    private Scanner input;

    public GameUI(){
        this.input = "";
    }

    public static String readUserGuess(){
       this.input = in.next();
       return input;
    }

   public static void displayResult()
}
