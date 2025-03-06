import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array : ");
        int arraySize = sc.nextInt();
        int [] array = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arraySize;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The Largest value is "+max);

    }
}
