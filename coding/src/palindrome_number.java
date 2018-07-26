public class palindrome_number {
    public static void main(String[] args) {


    }

    /**
     * 愚蠢的方法！！   需要大量是时间和内存空间  十分不好用
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x){
        String s=String.valueOf(x);
        if(s==null||s.length()<=1){
            return true;
        }
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }


    /**
     * 此方法比较合适
     * @param x
     * @return
     */
    public static boolean isPalindrome2(int x){
        if(x<0){
            return false;
        }
        return x==reverse(x);
    }

    public static int reverse(int x){
        int rst=0;

        while(x!=0){
            rst=rst*10+x%10;
            x=x/10;
        }
        return rst;
    }

}
