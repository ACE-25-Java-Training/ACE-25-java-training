/**
 * The class is to generate a string of numbers separated by commas using StringBuilder
 * then the multiples of 5 in the string is replaced to their word form like five,ten
 * using String buffer
 *
 * @author thangaakilanv
 */

public class GenerateNumberString {
    public static void main(String[] args) {
        StringBuilder numberSequence = new StringBuilder();
        StringBuilder numberWordSequence = new StringBuilder();
        byte range = 25;

        //Generate the number string using string builder
        for(int i=1;i<=range;i++){
            numberSequence.append((i==range)? i:i+"," );
        }

        System.out.println(numberSequence);


        /*
        Split the number String using comma as delimiter and then parse the bytes
        then check for multiples of 5 and insert the number or the word for the number
        also ensuring the addition of comma between numbers
         */
        for(String numberString: numberSequence.toString().split(",")){
            byte currentNumber = Byte.parseByte(numberString);
            if(currentNumber % 5 == 0){
                numberWordSequence.append(getName(currentNumber)+",");
            }
            else{
                numberWordSequence.append(currentNumber+",");
            }
        }
        numberWordSequence.deleteCharAt(numberWordSequence.length()-1);
        System.out.println(numberWordSequence.toString());
    }

    /**
     * A method to get the word form of numbers that are multiples of five
     * @param number The multiple fo five
     * @return the word form of the number
     */
    public static String getName(byte number){
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
