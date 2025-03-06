import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bitRes = num & 1;
        if(num < 0 || (num > 2 && bitRes == 0)){
            System.out.println("Not Prime");
            return;
        }
        int maxNumToCheck = (int)Math.sqrt(num);
        for(int i = 3;i <= maxNumToCheck;i += 2){
            if(num % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}