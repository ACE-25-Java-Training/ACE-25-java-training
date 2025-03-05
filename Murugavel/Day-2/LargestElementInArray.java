import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {11, 9, 29, 16, 13, 88, 63, 70};
        int maxElement = 0;
        for(int num : arr){
            maxElement = Math.max(maxElement, num);
        }
        System.out.println("The maximum element in the array " + Arrays.toString(arr) + " is " + maxElement);
    }
}
