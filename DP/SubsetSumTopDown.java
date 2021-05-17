public class SubsetSumTopDown {
    
    public static boolean sumSubset(int[] arr,int sum,int n){
        
        boolean[][] dp = new boolean[n+1][ sum + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < sum + 1; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }
                else if(i == 0){
                    dp[i][j] = false;
                }
                else if(j == 0){
                    dp[i][j] = true;;
                }
                
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum + 1; j++){
                if(j >= arr[i - 1]){
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
    
    
    
    public static void main(String[] args){
        int[] arr =  {1, 5, 3, 7, 4};
        int sum = 12;

        if(sumSubset(arr,arr.length,sum) == true){
            System.out.println("Subset Present");
        }
        else{
            System.out.println("Subset not Present");
        }
        
    }
}
