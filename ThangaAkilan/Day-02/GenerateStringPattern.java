import java.util.Scanner;

/**
 * A Project to display the inputted word in turned triangular pattern
 *
 * @author thangaakilanv
 */
public class GenerateStringPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = scanner.nextLine();
        int i=1;

        //First loop to output the first half of the pattern
        while(i<word.length()){
            System.out.println(word.substring(0,i++));
        }

        //Second loop to output the next half of the pattern from the full word
        while(i>0){
            System.out.println(word.substring(0,i--));
        }
        scanner.close();
    }
}
