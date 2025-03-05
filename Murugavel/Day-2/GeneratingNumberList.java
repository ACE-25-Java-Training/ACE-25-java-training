import java.util.Arrays;

public class GeneratingNumberList {
    public static StringBuilder generateList(){
        StringBuilder numberList = new StringBuilder();
        for(int num = 1;num <= 25;num++){
            String convertedNum = Integer.toString(num);
            numberList.append(convertedNum + ",");
        }
        numberList.deleteCharAt(numberList.length() - 1);
        return numberList;
    }

    public static StringBuffer replaceString(StringBuilder numberList){
        StringBuffer str = new StringBuffer(numberList);
        int startIndex = 0, endIndex = 0;
        StringBuilder temp = new StringBuilder();
        for(int index = 0;index < str.length();index++){
            char ch = str.charAt(index);
            if(ch == ','){ // slicing the individual numbers from the list
                endIndex = index;
                int parsedInt = Integer.parseInt(temp.toString());
                if(parsedInt % 5 == 0){
                    String toReplace = "";
                    switch (parsedInt){
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
                startIndex = index + 1;
            }else{
                temp.append(ch);
            }
        }

        //handling for the last number (i.e) 25 since there's no comma
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
