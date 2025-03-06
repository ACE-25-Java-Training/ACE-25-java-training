/**
 * The project is to provide an array in which the element at an index
 * is the product of all other elements except at the index
 * An Array is initialized at default for the operation
 *
 * @author thangaakilanv
 */
class Product {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5};
        int left=1, right=1, i=0, j=arr.length-1;

         /*The product of the elements of the array is calculated from either side
         Total product equals left product * right product
         */
        while(i<=j){
            left *= arr[i++];
            if(i-1!=j){
                right *= arr[j--];
            }
        }

        //The value for each index is calculated from the product
        for(i=0;i<arr.length;i++){
            arr[i] = (left*right) /arr[i];
            System.out.print(arr[i]+" ");
        }

    }
}