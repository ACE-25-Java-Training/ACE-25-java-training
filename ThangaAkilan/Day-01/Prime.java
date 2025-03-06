import java.util.Scanner;

/**
 * The Project is to check whether the entered number is  a prime or not
 * The number is provided as input
 * The output is displayed
 * @author thangaakilanv
 */
class Prime{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int numberToCheck = sc.nextInt();

        /*
        The condition to check for Non-Primes includes
        1.Numbers less than 2
        2.Multiples of 2 except 2
        3.Multiples of 3 except 3
         */
        if((numberToCheck<2)||((numberToCheck>3)&&((numberToCheck&1)==1 || numberToCheck%3==0))){
            System.out.print("Not a Prime");
            return;
        }

        /*
        Then check for every second number from 3 until the square root of the number
        If a factor is found then it is not prime
        else it is prime
         */
        for(int i=3;i<=Math.sqrt(numberToCheck);i+=2){
            if(numberToCheck%i==0){
                System.out.print("Not a Prime");
                return;
            }
        }
        System.out.print("Prime");
    }
}