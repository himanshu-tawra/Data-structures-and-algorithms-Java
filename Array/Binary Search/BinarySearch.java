public class BinarySearch {
    

    static int bsearch(int[] arr,int key,int low,int high,String order){

        if(order == "ascending"){
            while(low <= high){
                int mid = low + (high - low)/2;

                if(arr[mid] == key){
                    return mid;
                }
                else if(arr[mid] > key){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        else if(order == "descending"){
            while(low <= high){
                int mid = low + (high - low)/2;

                if(arr[mid] == key){
                    return mid;
                }
                else if(arr[mid] > key){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }


    static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        int[] firstArray = {1,2,3,4,6,8,10,12,21,25};
        int[] secondArray = {50,27,22,19,17,14,11,5,2};
        int key = 2;

        int firstResult = bsearch(firstArray, key, 0, firstArray.length - 1, "ascending");
        
        printArray(firstArray);
        
        if(firstResult == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + firstResult);
        }



        int secondResult = bsearch(secondArray, key, 0, secondArray.length - 1, "descending");
        
        printArray(secondArray);
        
        if(secondResult == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + secondResult);
        }


    }




}
