import java.util.Scanner;

/**
 * A Project to output the tables from 1 to 10 of the inputted number
 *
 * @author thangaakilanv
 */
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int tableNumber = sc.nextInt();

        //Print the tables of the inputted number
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",i,tableNumber, i*tableNumber);
        }
    }
}
