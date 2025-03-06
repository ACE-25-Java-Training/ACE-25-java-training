/**
 * The class is used to build a string from a String array using StringBuilder and
 * then reverse the string using String Buffer
 * @author thangaakilanv
 */
public class ConvertString {
    public static void main(String[] args) {
        String [] listOfStrings = {"Hello", "I","am","good"};
        StringBuilder sentence = new StringBuilder();
        //Iterate through the array to generate the Stiring
        for(String word: listOfStrings){
            sentence.append(word);
        }

        //StringBuilder is converted to String
        String concatenatedSentence = sentence.toString();
        System.out.println("Concatenated to StringBuilder : "+concatenatedSentence);

        //String Buffer is used to reverse the String
        StringBuffer reversedSentence = new StringBuffer(concatenatedSentence);
        System.out.println("Reversed using StringBuffer : "+reversedSentence.reverse());



    }
}
