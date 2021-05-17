public class knapsack {
    public static void main(String[] args){
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;

        int[][] dp = new int[W+1][wt.length + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        int maxProfit = knapsackRecursive(wt,val,W,wt.length,dp);

        System.out.println(maxProfit);
    }

    public static int knapsackRecursive(int[] wt,int[] val,int W,int n,int[][]dp){

        
        if(W == 0 || n == 0){
            return 0;
        }
        if(dp[W][n] != -1){
            return dp[W][n];
        }
        if(wt[n - 1] <= W){
            return dp[W][n] = Integer.max(val[n-1] + knapsackRecursive(wt, val, W - wt[n-1], n-1,dp), knapsackRecursive(wt, val, W, n-1,dp));
        }
        else{
            return dp[W][n] = knapsackRecursive(wt, val, W, n-1,dp);
        }
    }
}
