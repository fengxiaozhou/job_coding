public class integer_to_roman {
    public static void main(String[] args) {
        System.out.print(intToRoman(4));
    }

    public static String intToRoman(int num) {
        String res="";
        if(num/1000!=0){
            for(int i=0;i<num/1000;i++){
                res+="M";
            }
            num=num%1000;
        }
        if(num/900!=0){
            for(int i=0;i<num/900;i++){
                res+="CM";
            }
            num=num%900;
        }
        if(num/500!=0){
            for(int i=0;i<num/500;i++){
                res+="D";
            }
            num=num%500;
        }
        if(num/400!=0){
            for(int i=0;i<num/400;i++){
                res+="CD";
            }
            num=num%400;
        }
        if(num/100!=0){
            for(int i=0;i<num/100;i++){
                res+="C";
            }
            num=num%100;
        }
        if(num/90!=0){
            for(int i=0;i<num/90;i++){
                res+="XC";
            }
            num=num%90;
        }
        if(num/50!=0){
            for(int i=0;i<num/50;i++){
                res+="L";
            }
            num=num%50;
        }
        if(num/40!=0){
            for(int i=0;i<num/40;i++){
                res+="XL";
            }
            num=num%40;
        }
        if(num/10!=0){
            for(int i=0;i<num/10;i++){
                res+="X";
            }
            num=num%10;
        }
        if(num/9!=0){
            for(int i=0;i<num/9;i++){
                res+="IX";
            }
            num=num%9;
        }
        if(num/5!=0){
            for(int i=0;i<num/5;i++){
                res+="V";
            }
            num=num%5;
        }
        if(num/4!=0){
            for(int i=0;i<num/4;i++){
                res+="IV";
            }
            num=num%4;
        }
        if(num!=0){
            for(int i=0;i<num;i++){
                res+="I";
            }
        }
        return res;
    }

    /**
     * 这个方法比较好~~
     * @param num
     * @return
     */
    public String intToRoman1(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }

}