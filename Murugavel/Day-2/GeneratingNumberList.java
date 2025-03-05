import java.util.Arrays;

public class GeneratingNumberList {
    public static StringBuilder generateList(){
        StringBuilder numberList = new StringBuilder();
        for(byte num = 1;num <= 25;num++){
            String convertedByte = Byte.toString(num);
            numberList.append(convertedByte).append(",");
        }
        numberList.deleteCharAt(numberList.length() - 1);
        return numberList;
    }

    public static StringBuffer replaceString(StringBuilder numberList){
        StringBuffer str = new StringBuffer(numberList);
        byte startIndex = 0, endIndex = 0;
        StringBuilder temp = new StringBuilder();
        for(byte index = 0;index < str.length();index++){
            char ch = str.charAt(index);
            if(ch == ','){ // slicing the individual numbers from the list
                endIndex = index;
                byte parsedByte = Byte.parseByte(temp.toString());
                if(parsedByte % 5 == 0){
                    String toReplace = "";
                    switch (parsedByte){
                        case 5:
                            toReplace = "five";
                            break;
                        case 10:
                            toReplace = "ten";
                            break;
                        case 15:
                            toReplace = "fifteen";
                            break;
                        case 20:
                            toReplace = "twenty";
                            break;
                    }
                    str.replace(startIndex, endIndex, toReplace);
                    index += (toReplace.length() - temp.length()); // recalculating the index since the buffer has been updated
                }
                temp = new StringBuilder(); // clearing the stored number string inside the stringbuilder
                startIndex = (byte) (index + 1);
            }else{
                temp.append(ch);
            }
        }

        //handling for the last number (i.e) 25 since there's no comma
        // (can do checks here if the last number is not guaranteed to be a multiple of 5)
        str.replace(startIndex, str.length(), "twentyfive");
        return str;
    }

    public static void main(String[] args) {
        StringBuilder numberList = generateList();
        System.out.println(numberList);
        StringBuffer result = replaceString(numberList);
        System.out.println(result);
    }
}
