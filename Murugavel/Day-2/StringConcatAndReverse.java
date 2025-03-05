public class StringConcatAndReverse {
    public static void main(String[] args) {
        String[] inputArr = {"the", "brown", "fox", "had", "a", "red", "scar"};
        StringBuilder concatenatedString = new StringBuilder();
        for(String str : inputArr){
            concatenatedString.append(str);
        }
        System.out.println("Concatenated String is " + concatenatedString);
        StringBuffer bufferString = new StringBuffer(concatenatedString);
        bufferString.reverse();
        System.out.println("Reversed concatenated string is " + bufferString);
    }
}
