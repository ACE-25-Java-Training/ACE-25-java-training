import java.util.Scanner;

/**
 * The PatternPrinting method provides methods to print the intended pattern.
 * The methods take a String as an input.
 * The method printPattern(String) uses string slicing each time to print the pattern.
 * The method printPatterUsingBuilder(String) uses StringBuilder to construct and destruct the string to
 * get the intended pattern.
 * @author Murugavel
 */
public class PatternPrinting {

    /**
        * Prints the intended pattern from the string passed as an argument.
        * This method retrieves the intended of the string using the substring() method.
        * @param userInput
     */
    public static void printPattern(String userInput){
        int stringLength = userInput.length();
//        First half of the pattern
        for(int len = 1;len <= stringLength;len++){
            String slicedString = userInput.substring(0, len);
            System.out.println(slicedString);
        }
//        Second half of the pattern
        for(int len = stringLength - 1;len >= 1;len--){
            String slicedString = userInput.substring(0, len);
            System.out.println(slicedString);
        }
    }

    /**
       * Prints the intended pattern from the string passed as an argument.
       * This method constructs the intended portion of the string with the help of stringbuilder.
       * Uses the methods append() and deleteCharAt() to construct the string from the existing stringbuilder part.
       * @param userInput
     */

    public static void printPatternUsingBuilder(String userInput){
        StringBuilder str = new StringBuilder();
        int stringLength = userInput.length();
//        First half of the pattern
        for(int index = 0;index < stringLength;index++){
            char characterAtIndex = userInput.charAt(index);
            str.append(characterAtIndex);
            System.out.println(str);
        }
//        Second half of the pattern
        while (str.length() > 1){
            str.deleteCharAt(str.length() - 1);
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        printPatternUsingBuilder(userInput);
        sc.close();
    }
}
