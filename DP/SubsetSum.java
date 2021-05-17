/*
Given a set of non-negative integers, and a value sum, 
determine if there is a subset of the given set with sum equal to given sum. 
*/

public class SubsetSum {

    public static int sumSubset(int[] arr,int n,int sum,int [][]dp){

        if(n == 0 && sum == 0){
            return 1;
        }
        else if(n == 0 || sum == 0){
            return 0;
        }

        if(dp[n][sum] != -1){
            return dp[n][sum];
        }
        if(sum >= arr[n-1]){
            return dp[n][sum] = Integer.max(sumSubset(arr, n - 1, sum - arr[n-1],dp) , sumSubset(arr, n-1, sum,dp));
        }
        else{
            return dp[n][sum] = sumSubset(arr, n - 1, sum,dp);
        }
    }
    public static void main(String[] args){
        int[] arr =  {1, 5, 3, 7, 4};
        int sum = 12;

        int[][] dp = new int[arr.length + 1][ sum + 1];
        for(int i = 0; i < arr.length + 1; i++){
            for(int j = 0; j < sum + 1; j++){
                dp[i][j] = -1;
            }
        }
        if(sumSubset(arr,arr.length,sum,dp) == 1){
            System.out.println("Subset Present");
        }
        else{
            System.out.println("Subset not Present");
        }
        
    }    
}
