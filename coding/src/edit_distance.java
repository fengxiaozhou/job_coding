/**
 * @author Fz
 * @date 2018/8/15 15:46
 */
public class edit_distance {
    public static void main(String[] args) {
        System.out.println(minDistance("a","a"));
    }
    public static  int minDistance(String word1, String word2) {
        if(word1 == null || word1.length() == 0) {
            return word2 == null ? 0 : word2.length();
        }

        if(word2 == null || word1.length() == 0)
            return word1.length();
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(word1.charAt(i)==word1.charAt(j)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
