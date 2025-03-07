import java.util.Arrays;

public class ProductArray {
    // method 1 using division operator
    public static int[] findProductExceptSelf(int arr[]){
        int res[] = new int[arr.length];
        int totalProd = 1;
        for(int num : arr){
            totalProd *= num;
        }
        for(int i = 0;i < arr.length;i++){
            res[i] = totalProd / arr[i];
        }
        return res;
    }

//    method 2 using prefix and suffix products
    public static  int[] findProductExceptSelfAlt(int arr[]){
        int res[] = new int[arr.length];
        int prod = 1;
        for(int i = 0;i < arr.length;i++){
            res[i] = prod;
            prod *= arr[i];
        }
        prod = 1;
        for(int i = arr.length - 1;i >= 0;i--){
            res[i] *= prod;
            prod *= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int res[] = findProductExceptSelfAlt(arr);
        System.out.println(Arrays.toString(res));
    }
}
