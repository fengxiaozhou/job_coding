import java.util.ArrayList;

public class valid_palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Bab"));
    }
    public static boolean isPalindrome(String s) {
        if(s=="") return true;
        s=s.toLowerCase();
        ArrayList<Character> a=new ArrayList<>();
        for (char c:s.toCharArray()) {
            if((c>='a'&&c<='z')||(c>=48&&c<=57)){
                a.add(c);
            }
        }
        int l=0;
        int r=a.size()-1;
        while(l<=r){
            if(a.get(l++)!=a.get(r--)){
                return false;
            }
        }
        return true;
    }
}
