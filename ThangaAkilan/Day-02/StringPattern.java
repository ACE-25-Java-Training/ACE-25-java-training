import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = sc.nextLine();
        int i=1;
        while(i<word.length()){
            System.out.println(word.substring(0,i++));
        }
        while(i>0){
            System.out.println(word.substring(0,i--));
        }
    }
}
