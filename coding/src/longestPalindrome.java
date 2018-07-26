public class longestPalindrome {

    public static void main(String[] args) {
        String a="abb";
        System.out.println(longestPalindrome(a));
    }

    /**
     * 这是一种愚蠢的暴力方法  不推荐
     * @param s
     * @return
     */

    public static String longestPalindrome1(String s){
        String result="";
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    if(max<=s.substring(i,j).length()){
                        max=s.substring(i,j).length();
                        result=s.substring(i,j);
                    }
                }
            }
        }
        return result;

    }

    public static Boolean isPalindrome(String s){
        if (s.length()==0||s.length()==1){
            return true;
    }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    /**
     * 从中间开是判断是否为回文数字，较快，妥妥的
     */
    private static int left ,maxLen;
    public static String longestPalindrome(String s){
        if(s==null||s.length()<2){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            findMaxPalindrome(s,i,i);
            findMaxPalindrome(s,i,i+1);
        }

        return s.substring(left,left+maxLen);
    }

    private static void findMaxPalindrome(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        if(maxLen<j-i-1){
            left=i+1;
            maxLen=j-i-1;
        }

    }
}
