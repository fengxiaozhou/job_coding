public class Reverse_digits {
    public static void main(String[] args) {
        reverse(-692453452);
    }

    public static int reverse(int x){
        if(x==0){
            return 0;
        }
        int sub=1;
        String s=String.valueOf(x);
        if(s.charAt(0)=='-'){
            sub=-1;
            s=s.substring(1,s.length());
        }
        long res=0;
        for(int i=s.length()-1;i>=0;i--){
            res=res*10+(s.charAt(i)-'0');
        }
        res=res*sub;
        if(res>0){
            if(res > 0x7fffffff)
                return 0;
        }
        else{
            if(res < 0x80000000)
                return 0;
        }

        return (int)res;
    }
}
