
import java.util.Scanner;
public class HangMan<count> {

    //@carlosdiaz

    private static String[] words = {"Tokyo", "Shanghai", "London", "Istanbul", "Moscow", "Baghdad", "Madrid", "Berlin", "Seattle"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String line = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 0;


    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);

        while (count < 10 && line.contains("_")) {
            System.out.println("Guess letter ");
            System.out.println(line);
            String guess = ran.next();
            hang(guess);
        }
        ran.close();
    }

    private static void hang(String guess) {
        String newline = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newline += guess.charAt(0);
            } else if (line.charAt(i) != '_') {
                newline += word.charAt(i);
            } else {
                newline += "_";
            }
        }

        if (line.equals(newline)) {
            count++;
            hangman();
        } else {
            line = newline;
        }
        if (line.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    private static void hangman() {
        if (count == 1) {
            System.out.println("Wrong guess, try again,  attempt 1");

        }
        if (count == 2) {
            System.out.println("Wrong guess, try again,  attempt 2");

        }
        if (count == 3) {
            System.out.println("Wrong guess, try again,  attempt 3");

        }
        if (count == 4) {
            System.out.println("Wrong guess, try again,  attempt 4");

        }
        if (count == 5) {
            System.out.println("Wrong guess, try again,  attempt 5");

        }
        if (count == 6) {
            System.out.println("Wrong guess, try again,  attempt 6");

        }
        if (count == 7) {
            System.out.println("Wrong guess, try again,  attempt 7");

        }
        if (count == 8) {
            System.out.println("Wrong guess, try again,  attempt 8");

        }
        if (count == 9) {
            System.out.println("Wrong guess, try again,  attempt 9");

        }
        if (count == 10) {
            System.out.println("Game Over,  attempt 10");

        }

    }

}