import java.util.Arrays;

/**
 * This class provides methods to find the largest element in a given array
 * @author Murugavel
 */
public class LargestElementInArray {

    /**
       * Finds the maximum element in the array that is passed as an argument.
       * Iterates over the array to find the maximum element using the Math.max() method.
       * @param arr
       * @return int
     */
    public static int findLargestElement(int[] arr){
        int maxElement = 0;
        for(int num : arr){
            maxElement = Math.max(maxElement, num);
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int arr[] = {11, 9, 29, 16, 13, 88, 63, 70};
        int maxElement = findLargestElement(arr);
        System.out.println("The maximum element in the array " + Arrays.toString(arr) + " is " + maxElement);
    }
}
