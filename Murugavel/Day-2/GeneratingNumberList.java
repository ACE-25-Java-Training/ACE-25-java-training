/**
 * This class provides methods to generate a number list and replace the multiples of 5 with the actual word.
 * @author Murugavel
 */
public class GeneratingNumberList {

    /**
       * Generates a list of numbers from 1 to 25.
       * The number is converted to a string using the Byte.toString() method.
       * The converted string is appended to a stringbuilder separated by comma operator.
       * @return StringBuilder
     */
    public static StringBuilder generateList(){
        StringBuilder numberList = new StringBuilder();
        for(byte num = 1;num <= 25;num++){
            String convertedByte = Byte.toString(num);
            numberList.append(convertedByte).append(",");
        }
        numberList.setLength(numberList.length() - 1); // removes the last character (",")
        return numberList;
    }

    /**
       * Replaces the numbers that are multiples of 5 with the actual word
       * Slices the numbers that are separated by commas into an array
       * Converts the string to byte with the help of Byte.parseByte() method
       * Replaces the numbers to their actual word using wordReplacements[].
       * @param numberList
       * @return StringBuilder
     */
    public static StringBuilder replaceString(StringBuilder numberList){
        StringBuilder resultStr = new StringBuilder();
        // array to replace the number with the actual word
        String[] wordReplacements = {"five", "ten", "fifteen", "twenty", "twentyfive"};
        int replacementArrIndex = 0; // index to store the next replacement word
        String[] splittedArr = numberList.toString().split(",");
        for(String string : splittedArr){
            byte convertedByte = Byte.parseByte(string);
            if(convertedByte % 5 == 0){
                resultStr.append(wordReplacements[replacementArrIndex++]);
            }else{
                resultStr.append(string);
            }
            resultStr.append(",");
        }
        resultStr.setLength(resultStr.length() - 1); // removing the last comma
        return resultStr;
    }

    public static void main(String[] args) {
        StringBuilder numberList = generateList();
        System.out.println(numberList);
        StringBuilder result = replaceString(numberList);
        System.out.println(result);
    }
}
