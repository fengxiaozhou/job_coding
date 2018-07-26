
public class zigzag_conversion {

    public static void main(String[] args) {
        convert2("PAYPALISHIRING,", 3);
    }

    /**
     * 方法很蠢   构造了数组   内存空间站得太多了
     * @param s
     * @param nRows
     * @return
     */
    public static String convert(String s, int nRows) {
        StringBuilder res=new StringBuilder();
        if(nRows==1){
            return s;
        }
        char[][] list=new char[nRows][];
        for(int i=0;i<nRows;i++){
            list[i]=new char[1000];
        }
        int row=0;
        int col=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(flag==true){
                list[row][col]=s.charAt(i);
                row++;
            }else{
                row--;
                col++;
                list[row][col]=s.charAt(i);
            }
            if(row==0){
                flag=true;
                row++;
            }
            if(row==nRows){
                flag=false;
                row--;
            }
        }
        for (char[] a:list) {
            for (char b:a){
                if(b>0) {
                    res.append(b);
                }
            }
        }
        System.out.print(res);
        return res.toString();
    }

    /**
     * 优良的方法   其实不需要考虑
     * @param s
     * @param nRows
     * @return
     */

    public static String convert2(String s, int nRows){

        if(s==null||nRows<=1||s.length()==0){
            return s;
        }
        StringBuffer[] sb=new StringBuffer[nRows];
        for(int i=0;i<nRows;i++){
            sb[i]=new StringBuffer();
        }
        int i = 0;
        while(i<s.length()){
            for(int j=0;j<nRows&&i<s.length();j++){
                sb[j].append(s.charAt(i++));
            }
            for(int j=nRows-2;j>0&&i<s.length();j--){
                sb[j].append(s.charAt(i++));
            }
        }

        for(int j=1;j<nRows;j++){
            sb[0].append(sb[j]);
        }
        System.out.print(sb[0]);
        return sb[0].toString();
    }
}
