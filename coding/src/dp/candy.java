package dp;

import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/9/7 13:23
 */
public class candy {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{2,3,2}));
    }
    public static int candy(int[] ratings) {
        int[] num=new int[ratings.length];
        Arrays.fill(num,1);
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]<ratings[i+1]){
                num[i+1]=num[i]+1;
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if((ratings[i]<ratings[i-1])){
                num[i-1]=Math.max(num[i-1],num[i]+1);
            }
        }
        System.out.println(Arrays.toString(num));
        int s=0;
        for (int a:num) {
            s+=a;
        }
        return s;
    }
}
