import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/9/13 9:43
 */
public class xinsi {
    public static void main(String[] args) {
        ArrayList<String> res=fun(new int[]{});
        for (String a:res
             ) {
            System.out.print(a+" ");
        }
    }
    public static ArrayList fun(int arr[]){
        ArrayList<String> res=new ArrayList<>();
        String s="";
        if(arr==null||arr.length==0){
            res.add("0-->99");
            return res;
        }
        if(arr.length==99){
            return res;
        }
        if (arr[0]!=0) {
            if (arr[0]-0 == 1) {
                s = String.valueOf(0);
                res.add(s);
            } else {
                s = (0) + "-->" + (arr[0] - 1);
                res.add(0, s);
            }
        }
        for(int i=1;i<arr.length;i++){
                if(arr[i]-arr[i-1]==1){
                    continue;
                }else if(arr[i]-arr[i-1]==2){
                    s=String.valueOf(arr[i]-1);
                    res.add(s);
                }else{
                    s=(arr[i-1]+1)+"-->"+(arr[i]-1);
                    res.add(s);
                }
            }
        if(arr[arr.length-1]!=99){
            if(99-arr[arr.length-1]==1){
                s=String.valueOf(99);
                res.add(s);
            }else{
                s=(arr[arr.length-1]+1)+"-->"+(99);
                res.add(s);
            }
        }
        return res;
    }
}
