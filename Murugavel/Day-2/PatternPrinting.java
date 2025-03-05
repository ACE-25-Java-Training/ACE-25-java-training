import java.util.Scanner;
public class PatternPrinting {
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
    }
}
