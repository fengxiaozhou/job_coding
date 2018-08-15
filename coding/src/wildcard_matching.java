public class wildcard_matching {
    public static void main(String[] args) {
        System.out.println(isMatch2("aab","*a*b"));
    }
    public static boolean isMatch2(String s, String p) {
        if((s == null && p == null) || (s.length() == 0 && p.length() == 0))
            return true;
        if(p.length() == 0 && s.length() != 0)
            return false;

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for(int i = 1; i <= p.length(); i++){
            // 第一行，匹配字符为空，所以考虑待匹配字符为*的情况
            if(p.charAt(i - 1) == '*')
                dp[0][i] = dp[0][i-1];
        }
        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= p.length(); j++){
                if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?')
                    dp[i][j] = dp[i-1][j-1];
                if(p.charAt(j - 1) == '*')
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
            }
        }

        return dp[s.length()][p.length()];
    }
}
