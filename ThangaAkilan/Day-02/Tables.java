import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int tableNumber = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",i,tableNumber, i*tableNumber);
        }
    }
}
