package pony;

/**
 * @author Fz
 * @date 2018/9/19 21:07
 */
public class no1 {
    public static void main(String[] args) {

    }
    public static boolean issub(int[] arr){
        if(arr.length<3){
            return true;
        }
        int sub=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!=sub){
                return false;
            }
        }
        return true;
    }
}
