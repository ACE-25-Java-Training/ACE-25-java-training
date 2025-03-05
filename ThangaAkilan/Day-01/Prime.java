import java.util.Scanner;

class Prime{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numberToCheck = sc.nextInt();
        if((numberToCheck<2)||((numberToCheck>3)&&((numberToCheck&1)==1 || numberToCheck%3==0))){
            System.out.print("Not a Prime");
            return;
        }
        for(int i=3;i<=Math.sqrt(numberToCheck);i+=2){
            if(numberToCheck%i==0){
                System.out.print("Not a Prime");
                return;
            }
        }
        System.out.print("Prime");
    }
}