import java.util.Scanner;

/**
 * This class provides methods to print the multiplication table of a given number from 1 to 10
 * @author Murugavel
 */
public class MultiplicationTable {

    /**
       * Prints the multiplication table of the number from 1 to 10 that is passed as an argument.
       * @param num
     */
    public static void printMultiplicationTable(int num){
        System.out.println("Multiplication Table");
        for(int multiplier = 1;multiplier <= 10;multiplier++){
            System.out.println(num + "*" + multiplier + "=" + num * multiplier);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printMultiplicationTable(num);
        sc.close();
    }
}
