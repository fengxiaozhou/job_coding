package dp;

import java.util.*;

/**
 * @author Fz
 * @date 2018/9/7 8:49
 */
public class wordBreakii {
    static ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(wordBreak("catsanddog",new HashSet<>(Arrays.asList(new String[]{"cat", "and", "sand", "dog"}))));
    }
    public static ArrayList<String> wordBreak(String s, Set<String> dict) {
        dfs(s,0,"",dict);
        return list;
    }

    public static void dfs(String s,int index,String str, Set dict){
        if(index>=s.length()){
                list.add(str.substring(0,str.length()-1));
        }
        for (int i = index; i <=s.length() ; i++) {
            if (dict.contains(s.substring(index, i))) {
                dfs(s, i, s.substring(index, i) + " " + str, dict);
            }
        }
    }

}
