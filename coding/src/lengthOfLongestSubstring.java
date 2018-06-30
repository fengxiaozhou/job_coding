import java.util.HashMap;

/**
 * @author fengzhou
 * @data 2018/06/30
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String a="hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac";
        System.out.print(longestSubstring(a));

    }
    public static int longestSubstring(String s){
            if(s == null || s.length() == 0) return 0;
            //新建一个map进行存储char
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            int leftBound = 0;
            int max = 0;
            for(int i=0; i<s.length();i++){
                char c = s.charAt(i);
            //窗口左边可能为下一个char，或者不变
            leftBound = Math.max(leftBound,(map.containsKey(c))? map.get(c)+1:0);
            max = Math.max(max, i-leftBound+1);//当前窗口长度
            map.put(c,i);
            }
            return max;

            }
    }

