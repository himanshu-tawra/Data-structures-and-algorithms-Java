/*
* Written by       : Himanshu Tawra
* Aim              : Program to rotate array
* Time Complexity  : O(n)
* Space Complexity : O(n)
*
* */


import java.lang.*;

public class rotateArray{

     static void rotateArray(int arr[]){
        if(arr.length <= 1){
            return;
        }

        int [] arr_2 = new int[arr.length];
        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            arr_2[j] = arr[i];
            j--;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr_2[i];
        }
    }



    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};

        rotateArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}