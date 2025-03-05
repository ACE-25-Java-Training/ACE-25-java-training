import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String userInput){
        StringBuilder copiedStr = new StringBuilder();
        HashSet<Character> set = new HashSet<>(); // using hashset since the overall sc would be O(26) which is as good as O(1)
        for(int index = 0;index < userInput.length();index++){
            char ch = userInput.charAt(index);
            if(!set.contains(ch)){
                set.add(ch);
                copiedStr.append(ch);
            }
        }
        return copiedStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String userInput = sc.nextLine();
        String removedDuplicateStr = removeDuplicates(userInput);
        System.out.println(removedDuplicateStr);
    }
}
