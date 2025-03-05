import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table");
        for(int multiplier = 1;multiplier <= 10;multiplier++){
            System.out.println(num + "*" + multiplier + "=" + num * multiplier);
        }
    }
}
