import java.lang.*;
public class rotateArray2{

    static void rotateArray(int arr[]){
        if(arr.length <= 1){
            return;
        }
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static  void main(String [] args){

        int arr[] = {1,2,3,4,5,6};
        System.out.println("Array before rotation");
        rotateArray(arr);
        System.out.println("Array after rotation");
        printArray(arr);


    }




}