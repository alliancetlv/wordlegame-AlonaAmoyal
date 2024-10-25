/**
 * This task was created by Niv Seker (https://github.com/sekerniv)
 *
 * For any questions or further assistance, feel free to reach out!
 */

// Leave this import as it is. You'll need it
import assignmentfiles.*;

public class GameEngine {
    private String targetWord;
    private int attemptsLeft;
    private boolean isWin;
    
    public GameEngine(String targetWord) {
        this.target = targetWord;
        this.attemptsLeft = 6;
        this.isWin = false;
    }

    public String playGuess(String guess) {
        String answer = evaluateGuess(this.targetWord, guess);
        return answer;
    }

    public static void main(String[] args) {
        
    }

    /**
     * Compares the player's guess to the target word and returns feedback.
     * For each character in the guess:
     * - '*' if the character is in the correct position.
     * - '+' if the character is in the target word but in the wrong position.
     * - '-' if the character is not in the target word.
     *
     * The comparison is done up to the length of the shorter word, ignoring any extra characters.
     * Example:
     * targetWord = "taper", guess = "water"
     * Returns: "-*+**"
     **/
    public static String evaluateGuess(String targetWord, String guess) {
        String newS = "";
        if(targetWord.length() <= guess.length()){
            for(int i = 0; i < targetWord.length(); i++){
                for(int j = 0; j< guess.length(); j++){
                    if(targetWord.length(i) == guess.length(j)){
                        if(i == j){
                            newS = newS+""+"*";
                        }else{
                            newS = newS+""+"+";
                        }
                    }else{
                        newS = newS+""+"-";
                    }
                }
            }
        }else{
             for(int i = 0; i < guess.length(); i++){
                for(int j = 0; j< targetWord.length(); j++){
                    if(guess.length(i) == targetWord.length(j)){
                        if(i == j){
                            newS = newS+""+"*";
                        }else{
                            newS = newS+""+"+";
                        }
                    }else{
                        newS = newS+""+"-";
                    }
                }
            }
        }
        return newS;
    }

    public boolean isGameOver() {
        if(attemptsLeft == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isWin() {
        return false;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public String getTargetWord(){
        return this.targetWord;
    }
}
