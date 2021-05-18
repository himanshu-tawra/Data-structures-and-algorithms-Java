

/*

Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.
Groups can be made with any set of elements, i.e. elements need not to be continuous. And you need to consider each and every element of input array in some group.
Return true, if array can be split according to the above rules, else return false.

Input Format :
Line 1 : Integer N (size of array)
Line 2 : Array A elements (separated by space)
Output Format :
true or false
Constraints :
1 <= N <= 50
Sample Input 1 :
2
1 2
Sample Output 1 :
false
Sample Input 2 :
3
1 4 3
Sample Output 2 :
true


*/



import java.util.Arrays;

public class Main
{
    static int isSubset(int[] arr,int n,int sum,int[][] dp){
        
        if(sum == 0 && n == 0){
            return 1;
        }
        if(sum == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(dp[n][sum] != -1){
            return dp[n][sum];
        }
        if(arr[n-1] <= sum && arr[n-1] % 5 != 0){
            return dp[n][sum] = Integer.max(isSubset(arr,n - 1, sum, dp) , isSubset(arr,n - 1, sum - arr[n-1],dp)); 
        }
        else{
            return dp[n][sum] = isSubset(arr,n - 1, sum,dp);
        }
    } 
    
    static boolean findPartition(int[] arr){
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        if(sum % 2 != 0){
            return false;
        }
        else{
            int[][] dp = new int[arr.length + 1][sum/2 + 1];
            for(int[] row : dp){
                Arrays.fill(row,-1);
            } 
            if(isSubset(arr,arr.length,sum/2,dp) == 1){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
	public static void main(String[] args) {
        
        int arr[] = {1,4,3,2,1,5};
            
        System.out.println(findPartition(arr));    
    
	}
}
