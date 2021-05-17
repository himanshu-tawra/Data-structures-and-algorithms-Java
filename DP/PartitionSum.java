import java.util.Arrays;

/*
Partition problem is to determine whether a given set can be partitioned 

into two subsets such that the sum of elements in both subsets is the same. 
*/

public class PartitionSum {

    public static int subsetSum(int[] arr,int n,int sum,int[][] dp){

        if((sum == 0 && n == 0) || sum == 0){
            return 1;
        }
        if(sum != 0 && n == 0){
            return 0;
        }
        if(dp[n][sum] != -1){
            return dp[n][sum];
        }
        if(sum >= arr[n - 1]){
            return dp[n][sum] = Integer.max(subsetSum(arr, n - 1, sum - arr[n - 1],dp) , subsetSum(arr, n - 1, sum,dp));
        }
        else{
            return dp[n][sum] = subsetSum(arr, n - 1, sum,dp);
        }

    }

    public static boolean findPartition(int[] arr , int n){
        
        if(n == 0){
            return true;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        else{

            int[][] dp = new int[n + 1][sum/2 + 1];
            
            for(int[] row : dp){
                Arrays.fill(row,-1);
            }


            int result = subsetSum(arr,n,sum/2,dp);
            if(result == 1){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
    public static void main(String[] args){
        int arr[] = { 3, 1, 5, 9 };
        int n = arr.length;

        boolean answer = findPartition(arr, n);
        System.out.println(answer);
    }    
}
