public class RotateArray2 {

    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void reversalArray(int[] arr, int low,int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    void rotateArray(int[] arr, int d,int n){
        if(d == 0){
            return;
        }
        d = d % n;
        reversalArray(arr, 0, d-1);
        reversalArray(arr, d, n - 1);
        reversalArray(arr, 0, n - 1);
    }   

    public static void main(String[] args){
        
        RotateArray2 rotate = new RotateArray2();
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int d = 2;

        rotate.printArray(arr);
        rotate.rotateArray(arr, d, n);
        rotate.printArray(arr);

    }
    
}
