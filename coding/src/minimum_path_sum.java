/**
 * @author Fz
 * @date 2018/8/15 14:18
 */
public class minimum_path_sum {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{0}}));
    }
    public static  int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=1;i<grid[0].length;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<grid.length;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(dp[i][j-1]<dp[i-1][j]){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }else {
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
