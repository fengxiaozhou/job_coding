import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/9/5 14:44
 */
public class search_for_a_range {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,3},1)));
    }
    public static int[] searchRange(int[] A, int target) {
        int index1=0;
        int index2=A.length-1;
        int a=-1;
        int b=-1;
        boolean x=false;
        boolean y=false;
        while((x==false||y==false)&&(index1<=index2)){
          if(A[index1]==target&&x==false){
              a=index1;
              x=true;
          }else {
              if(x==false) index1++;
          }
          if(A[index2]==target&&y==false){
              b=index2;
              y=true;
          }else{
              if(y==false) index2--;
          }
        }
        return new int[]{a,b};
    }
}
