package dp;

public class unique_paths {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0},{1,0}}));
    }
    public static int uniquePaths(int m, int n) {
        if(m==1||n==1) return 1;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length==1) {
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if (obstacleGrid[0][i] == 1) {
                    return 0;
                }
            }
            return 1;
        }
        if(obstacleGrid[0].length==1) {
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if (obstacleGrid[i][0] == 1) {
                    return 0;
                }
            }
            return 1;
        }
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==0) {
                dp[i][0] = 1;
            }else{
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==0) {
                dp[0][i] = 1;
            }else{
                break;
            }
        }
        for(int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}

