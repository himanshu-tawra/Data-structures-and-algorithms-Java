/*

Write a function left rotate(ar[], d, n) that rotates arr[] of size n by d elements.

*/

public class RotateArray{
    
    void rotateByOne(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    void rotateMyArray(int[] arr,int d){

        for(int i = 0; i < d; i++){
            rotateByOne(arr);
        }
    }

    void printMyArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {5,7,9,10,12,21};

        RotateArray rotate = new RotateArray();
        rotate.printMyArray(arr);
        rotate.rotateMyArray(arr,3);
        rotate.printMyArray(arr);
    }
}