import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        HashSet strSet = new HashSet();
        StringBuilder resultStr = new StringBuilder(sc.nextLine());

//        for(char letter: inputString.toCharArray()){
//            if(resultStr.indexOf(letter+"")==-1){
//                resultStr.append(letter);
//            }
//        }
        for(int i=0;i<resultStr.length();i++){
            if(strSet.contains(resultStr.charAt(i))){
                resultStr.replace(i,i+1,"");
                i--;
            }else{
                strSet.add(resultStr.charAt(i));
            }
        }


        System.out.println(resultStr.toString());

    }
}
