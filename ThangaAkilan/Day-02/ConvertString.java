public class ConvertString {
    public static void main(String[] args) {
        String [] listOfStrings = {"Hello", "I","am","good"};
        StringBuilder sentence = new StringBuilder();
        for(String word: listOfStrings){
            sentence.append(word);
        }

        String concatenatedSentence = sentence.toString();
        System.out.println("Concatenated to StringBuilder : "+concatenatedSentence);

        StringBuffer reversedSentence = new StringBuffer(concatenatedSentence);
        System.out.println("Reversed using StringBuffer : "+reversedSentence.reverse());



    }
}
