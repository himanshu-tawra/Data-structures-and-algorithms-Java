public class knapsackTopDown {
    
    public static int topDownKnapsack(int[] wt,int[] val,int W,int n){


        int[][] dp = new int[n+1][W+1];

        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;
        }

        
        for(int i = 0; i < W+1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                
                if(j >= wt[i-1]){
                    dp[i][j] = Integer.max(dp[i-1][j - wt[i-1]] + val[i - 1],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];

    }

    public static void main(String[] args){
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;

        System.out.println(topDownKnapsack(wt, val, W, wt.length ));      
        
    }
}
