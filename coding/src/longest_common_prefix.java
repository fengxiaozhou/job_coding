public class longest_common_prefix {
    public static void main(String[] args) {

    }

//     对字符串数组进行排序，然后只要比较首尾两个字符串即可
//     public String longestCommonPrefix(String[] strs) {
//        StringBuilder result = new StringBuilder();
//         
//        if (strs!= null && strs.length > 0){
//         
//            Arrays.sort(strs);
//             
//            char [] a = strs[0].toCharArray();
//            char [] b = strs[strs.length-1].toCharArray();
//             
//            for (int i = 0; i < a.length; i ++){
//                if (b.length > i && b[i] == a[i]){
//                    result.append(b[i]);
//                }
//                else {
//                    return result.toString();
//                }
//            }
//        return result.toString();
//    }
    public static String longestCommonPrefix(String[] strs) {
        String res="";
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        if(strs.length==2){
            return findPrefix(strs[0],strs[1]);
        }
        res=findPrefix(strs[0],strs[1]);
        for (int i=2;i<strs.length;i++){
            if(res.length()==0){
                return "";
            }
            res=findPrefix(res,strs[i]);
        }
        return res;
    }
    public static String findPrefix(String a,String b){
        String res="";
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)) {
                return res;
            }else{
                res+=a.charAt(i);
            }
        }
        return res;
    }

}
