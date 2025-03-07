import java.util.HashSet;
import java.util.Scanner;

/**
 * The class is used to remove the duplicates from the string
 * Only the first occurence is allowed to exist
 *
 * @author thangaakilanv
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        HashSet setOfStrings = new HashSet();
        StringBuilder inputString = new StringBuilder(scanner.nextLine());

        /*
        Every letter is checked for presence in the set
        If it exists then the letter is removed from the string
        else the letter is added to the set
         */
        for(int i=0;i<inputString.length();i++){
            if(setOfStrings.contains(inputString.charAt(i))){
                inputString.replace(i,i+1,"");
                i--;
            }else{
                setOfStrings.add(inputString.charAt(i));
            }
        }

        // Output the resultant string
        scanner.close();
        System.out.println(inputString.toString());

    }
}
