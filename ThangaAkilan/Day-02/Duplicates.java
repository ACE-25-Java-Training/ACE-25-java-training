import java.util.HashSet;
import java.util.Scanner;

/**
 * The class is used to remove the duplicates from the string
 * Only the first occurence is allowed to exist
 *
 * @author thangaakilanv
 */
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        HashSet strSet = new HashSet();
        StringBuilder resultStr = new StringBuilder(sc.nextLine());

        /*
        Every letter is checked for presence in the set
        If it exists then the letter is removed from the string
        else the letter is added to the set
         */
        for(int i=0;i<resultStr.length();i++){
            if(strSet.contains(resultStr.charAt(i))){
                resultStr.replace(i,i+1,"");
                i--;
            }else{
                strSet.add(resultStr.charAt(i));
            }
        }

        // Output the resultant string
        System.out.println(resultStr.toString());

    }
}
