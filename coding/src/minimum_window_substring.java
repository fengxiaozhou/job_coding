public class minimum_window_substring {
    public String minWindow(String S, String T) {
        if(S==null||T==null||S.length()<T.length())
            return "";
        int[] a=new int[128];
        for (char c:T.toCharArray()) {
            a[c]++;
        }
        int begin=0,end=0,min=Integer.MAX_VALUE,count=T.length(),head=0;
        while(end<S.length()){
            if(a[S.charAt(end++)]-->0){
                count--;
            }
            while(count==0){
                if(end-begin<min){
                    min=end-begin;
                    head=begin;
                }
                if(a[S.charAt(begin++)]++==0){
                    count++;
                }
            }
        }
        return min==Integer.MAX_VALUE ? "" :S.substring(head, head+min);
    }
}
