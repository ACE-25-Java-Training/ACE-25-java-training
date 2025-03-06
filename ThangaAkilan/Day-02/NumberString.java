public class NumberString {
    public static void main(String[] args) {
        StringBuilder numberSeq = new StringBuilder();
        int range = 25, moveValue=0;

        for(int i=1;i<=range;i++){
            numberSeq.append((i==range)? i:i+"," );
        }

        System.out.println(numberSeq);
        String numberStr = numberSeq.toString();
        StringBuffer resultSeq = new StringBuffer(numberSeq);

        for(String number: numberStr.split(",")){
            int value = Integer.parseInt(number);
            if(value%5==0){
                int startIndex = resultSeq.indexOf(number);
                int digits = (int) Math.floor(Math.log10(value));
                String numericalword = getName(value);
                resultSeq.replace(startIndex,startIndex+digits+1,numericalword);
                moveValue = numericalword.length() -digits +moveValue;
            }
        }

        System.out.println(resultSeq.toString());



    }


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
