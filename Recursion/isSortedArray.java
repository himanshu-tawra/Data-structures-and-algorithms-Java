public class isSortedArray {
    
    static boolean isSorted(int arr[],int n){

        if(n == 0 || n == 1){
            return true;
        }

        if(arr[n-1] < arr[n-2]){
            return false;
        }


        return isSorted(arr, n-1);
        

    }


    public static void main(String[] args){

        int[] arr = {1,2,3,4};
        int len = arr.length;

        System.out.print(isSorted(arr,len));


    }
}
