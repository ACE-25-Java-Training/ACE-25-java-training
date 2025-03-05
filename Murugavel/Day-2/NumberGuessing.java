import java.util.Scanner;
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
    }
}
