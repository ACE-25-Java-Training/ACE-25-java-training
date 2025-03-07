import java.util.HashSet;
import java.util.Scanner;

/**
 * The RemoveDuplicateCharacters class provides methods to remove the duplicate characters of a string.
 * The removeDuplicates(String) method uses HashSet to remove the duplicate characters.
 * @author Murugavel
 */
public class RemoveDuplicateCharacters {

    /**
        * Removes the duplicate characters from the string.
        * Uses HashSet to check for duplicate characters.
        * Uses stringbuilder to construct the string in which no duplicates are present.
        * @param userInput
        * @return String
     */
    public static String removeDuplicates(String userInput){
        StringBuilder resultStr = new StringBuilder();
        HashSet<Character> set = new HashSet<>(); // using hashset since the overall sc would be O(26) which is as good as O(1)
        for(int index = 0;index < userInput.length();index++){
            char ch = userInput.charAt(index);
            if(!set.contains(ch)){
                set.add(ch);
                resultStr.append(ch);
            }
        }
        return resultStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String userInput = sc.nextLine();
        String removedDuplicateStr = removeDuplicates(userInput);
        System.out.println(removedDuplicateStr);
    }
}
