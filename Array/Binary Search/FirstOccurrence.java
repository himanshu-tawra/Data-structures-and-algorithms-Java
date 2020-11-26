class FirstOccurrence{

    static int firstOccurrence(int[] arr,int key){
        int low = 0; 
        int high = arr.length - 1;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                result = mid;
                high = mid - 1;
            }
            else if(arr[mid] > key){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return result;
    }

    public static void main(String[] args){

        int[] arr = {1,3,4,10,10,10,15,17};
        int key = 10;
        
        int first = firstOccurrence(arr, key);
        if(first == -1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("First occurrence of " + key + " is found at index " + first);
        }
    }



}