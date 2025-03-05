class Product {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5};
        int left=1, right=1, i=0, j=arr.length-1;

        while(i<=j){
            left *= arr[i++];
            if(i-1!=j){
            right *= arr[j--];
            }
        }

        for(i=0;i<arr.length;i++){
            arr[i] = (left*right) /arr[i];
            System.out.print(arr[i]+" ");
        }
        
    }
}