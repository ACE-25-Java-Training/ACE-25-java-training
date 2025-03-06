import java.util.Scanner;

/**
 * The NumberGuessing Class simulates a game where the user needs to guess the random number created by the system.
 * Uses do while loops to simulate the process until the user guesses the random generated number.
 * Uses flag variable to check for the correctness of the number guessed by the user.
 * Provides hints "Too Low" or "Too High" based on the input of the user.
 * @author Murugavel
 */
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte randomNum = (byte)(Math.random() * 100);
        boolean flag = false;
        do{
            System.out.print("Enter the number: ");
            byte userInput = sc.nextByte();
            if(userInput == randomNum){
                flag = true;
            }else if (userInput < randomNum) {
                System.out.println("Too Low");
            }else {
                System.out.println("Too High");
            }
        }while(!flag);
        System.out.println("You guessed it correct!!");
        sc.close();
    }
}
