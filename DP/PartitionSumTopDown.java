public class PartitionSumTopDown {


    static boolean subsetSum(int[] arr, int n, int sum){
        
        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i = 0; i < sum+1; i++){
            dp[0][i] = false;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < sum + 1; j++){
                if(j >= arr[i - 1]){
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    static boolean findPartition(int[] arr, int n){
        if(n == 0){
            return true;
        }
        int sum = 0;
        for(int ele : arr){
            sum += ele; 
        }

        if(sum % 2 != 0){
            return false;
        }
        else{
            sum /= 2;

            return subsetSum(arr,n,sum);
        }
    }
    public static void main(String[] args){
        int arr[] = { 3, 1, 5, 9 };
        int n = arr.length;

        boolean answer = findPartition(arr, n);
        System.out.println(answer);
    }
}