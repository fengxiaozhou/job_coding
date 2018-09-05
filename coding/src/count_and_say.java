/**
 * @author Fz
 * @date 2018/9/5 12:41
 */
public class count_and_say {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
    public static String countAndSay(int n) {
        if(n==0) return "";
        String res="1";
        while (--n>0){
            String cur="";
            for(int i=0;i<res.length();i++){
                int cnt=1;
                while(i+1<res.length()&&res.charAt(i)==res.charAt(i+1)){
                    cnt++;
                    i++;
                }
                cur+=String.valueOf(cnt)+res.charAt(i);
            }
            res=cur;
        }
        return res;
    }
}
