import java.util.HashMap;
import java.util.Map;

public class roman_to_integer {
    public static void main(String[] args) {
        System.out.print(romanToInt("MCMXCVI"));
    }
    public static int romanToInt(String s) {
        int res=0;
        Map <Character,Integer> map= new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int pre=0;
        int cur=0;
        for(int i=s.length()-1;i>=0;i--){
            cur=map.get(s.charAt(i));
            if(cur<pre){
                res-=cur;
            }else{
                res+=cur;
            }
            pre=cur;
        }
        return res;
    }
}
