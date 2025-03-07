import java.util.Random;
import java.util.Scanner;

/**
 * The class is used to guess a random number until the user guesses the exact number
 * The user is provided with clues to get closer to the number
 *
 * @author thangaakilanv
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Generate a random number
        byte numberToGuess =  (byte) new Random().nextInt(100);

        //Provide clues until the guess is correct
        while(true){
            System.out.print("Your Guess : ");
            byte guess = scanner.nextByte();
            if(guess == numberToGuess)
                break;
            if(Math.abs(guess - numberToGuess)>40){
                System.out.print("Too ");
            }else if(Math.abs(guess - numberToGuess)<15){
                System.out.print("Little ");
            }
            if(guess> numberToGuess){
                System.out.print("High\n");
            }else{
                System.out.print("Low\n");
            }
        }
        scanner.close();
        System.out.print("Your guess is correct ...");
    }
}
