import java.util.Scanner;


/**
 * The class is to find the largest number in an array
 *
 */
public class FindLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        while(arraySize <= 0) {
            System.out.print("Enter the number of elements of the array (Positive) : ");
            arraySize = scanner.nextInt();
        }
        int [] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            System.out.printf("Enter element %d : ",i+1);
            array[i] = scanner.nextInt();
        }
        int max = array[0];

        for(int i = 1; i < arraySize; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        scanner.close();
        System.out.println("The Largest value is "+max);

    }
}
