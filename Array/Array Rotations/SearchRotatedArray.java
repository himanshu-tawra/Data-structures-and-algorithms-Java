import javax.naming.directory.SearchControls;

/*

Search an element in a sorted and rotated array

*/


public class SearchRotatedArray {
    
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int searchMethod(int [] arr,int low,int high,int key){

        if(low >= high){
            return -1;
        }
        
        int mid = low + (high - low)/2;

        if(arr[mid] == key){
            return mid;
        }
        if(arr[low] <= arr[mid]){
            if(key >= arr[low] && key <= arr[mid]){
                return searchMethod(arr, low, mid, key);
            }

            return searchMethod(arr, mid + 1, high, key);
        }
        if(key >= arr[mid] && key <= arr[high]){
            return searchMethod(arr, mid + 1, high, key);
        }

        return searchMethod(arr, low, mid - 1, key);

    }

    public static void main(String[] args){
        int[] arr = {5,6,7,1,2,3,4};
        int key = 5;

        printArray(arr);

        int result = searchMethod(arr,0,arr.length-1,key);

        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index : " + result);
        }

    }



}
