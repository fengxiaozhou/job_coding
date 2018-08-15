public class jump_game_ii {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
    public static int jump(int[] A){
        int[] dp=new int[A.length];
        for(int i=0;i<A.length;i++){
            int maxPostion=Math.min(i+A[i],A.length-1);
            for(int j=i+1;j<=maxPostion;j++){
                if(dp[j]==0){
                    dp[j]=dp[i]+1;
                 }
            }
            if(dp[A.length-1]!=0) break;
        }
        return dp[A.length-1];
    }
}
