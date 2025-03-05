public class StringConcatAndReverse {
    public static StringBuilder concatenate(String[] inputArr){
        StringBuilder concatenatedString = new StringBuilder();
        for(String str : inputArr){
            concatenatedString.append(str);
        }
        return concatenatedString;
    }

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
