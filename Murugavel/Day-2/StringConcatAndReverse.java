/**
 * The StringConcatAndReverse class provides methods to concatenate and reverse a string.
 * The concatenate(String[]) method concatenates the individual strings of the array into one.
 * The reverseString(StringBuilder) method reverses the content of the StringBuilder with the help of StringBuffer.
 * @author Murugavel
 */
public class StringConcatAndReverse {

    /**
     * Concatenates the individual strings in the array into a single string.
     * Constructs the concatenated string using StringBuilder.
     * @param inputArr
     * @return StringBuilder
     */
    public static StringBuilder concatenate(String[] inputArr){
        StringBuilder concatenatedString = new StringBuilder();
        for(String str : inputArr){
            concatenatedString.append(str);
        }
        return concatenatedString;
    }

    /**
     * Reverses the string passed as param.
     * Uses StringBuffer to perform the reversal
     * @param concatenatedString
     * @return StringBuffer
     */
    public static StringBuffer reverseString(StringBuilder concatenatedString){
        StringBuffer bufferString = new StringBuffer(concatenatedString);
        bufferString.reverse();
        return bufferString;
    }

    public static void main(String[] args) {
        String[] inputArr = {"the", "brown", "fox", "had", "a", "red", "scar"};
        StringBuilder concatenatedString = concatenate(inputArr);
        System.out.println("Concatenated String is " + concatenatedString);
        StringBuffer reversedString = reverseString(concatenatedString);
        System.out.println("Reversed concatenated string is " + reversedString);
    }
}
