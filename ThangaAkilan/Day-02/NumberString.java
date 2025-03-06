/**
 * The class is to generate a string of numbers separated by commas using StringBuilder
 * then the multiples of 5 in the string is replaced to their word form like five,ten
 * using String buffer
 *
 * @author thangaakilanv
 */

public class NumberString {
    public static void main(String[] args) {
        StringBuilder numberSeq = new StringBuilder();
        int range = 25, moveValue=0;

        //Generate the number string using string builder
        for(int i=1;i<=range;i++){
            numberSeq.append((i==range)? i:i+"," );
        }

        System.out.println(numberSeq);
        String numberStr = numberSeq.toString();
        StringBuffer resultSeq = new StringBuffer(numberSeq);

        /*
        Multiples of 5 is replaced with their word form
        we use a pointer variable to move through the numbers
        after replacing with word, the pointer's movement is calculated from
        the inserted word length, removed number's digits

         */
        for(String number: numberStr.split(",")){
            int value = Integer.parseInt(number);
            if(value%5==0){
                int startIndex = resultSeq.indexOf(number); // Get the index
                int digits = (int) Math.floor(Math.log10(value)); // calculate the digits
                String numericalword = getName(value); // Get the word form
                resultSeq.replace(startIndex,startIndex+digits+1,numericalword); //replace the number with it's word
                moveValue = numericalword.length() -digits +moveValue;
            }
        }

        System.out.println(resultSeq.toString());



    }

    /**
     * A method to get the word form of numbers that are multiples of five
     * @param number The multiple fo five
     * @return the word form of the number
     */
    public static String getName(int number){
        return switch(number){
            case 5-> "five";
            case 10->"ten";
            case 15->"fifteen";
            case 20->"twenty";
            case 25->"twenty five";
            default-> "unknown";

        };
    }
}
