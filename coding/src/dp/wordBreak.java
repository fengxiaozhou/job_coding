package dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Fz
 * @date 2018/9/7 9:02
 */
public class wordBreak {
    public static void main(String[] args) {
        System.out.println(wordBreak("leetscode",new HashSet<String>(Arrays.asList(new String[]{"leet", "code"}))));

    }
    public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
