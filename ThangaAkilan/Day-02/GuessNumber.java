import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess =  new Random().nextInt(100);
        while(true){
            System.out.print("Your Guess : ");
            int guess = sc.nextInt();
            if(guess==numberToGuess)
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
        System.out.print("Your guess is correct ...");
    }
}
