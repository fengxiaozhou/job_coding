package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/6 13:58
 */
public class 二维数组中的查找 {
    public static void main(String[] args) {
        Find(7,new int[][]{{1,2,8,9},{4,7,10,13}});
    }
    public static boolean Find(int target, int [][] array) {
        if(array==null){
           return false;
        }
        int r=array.length-1;
        int c=0;
        while (r>=0 && c<=array[0].length-1){
            if(target>array[r][c]){
                c++;
            }else if(target<array[r][c]){
                r--;
            }else{
                return true;
            }
        }
        return false;
    }
}
