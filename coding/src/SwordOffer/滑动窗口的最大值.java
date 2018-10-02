package SwordOffer;

import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/9/24 16:00
 */
public class 滑动窗口的最大值 {
    public static void main(String[] args) {
        int[] num=new int[]{2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows(num,3));
    }
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res=new ArrayList<>();
        if(size==0){
            return res;
        }
        if(size>num.length){
            return res;
        }
        int pre=size-1;
        int last=0;
        int max=max(num,last,pre);
        res.add(max);
        last++;
        pre++;
        while(pre<=num.length-1){
            if(num[pre]>max){
               max=num[pre];
            }else{
                if(num[last-1]==max){
                    max=max(num,last,pre);
                }
            }
            res.add(max);
            last++;
            pre++;
        }
        return res;
    }
    public static int max(int[] num,int last,int pre){
        int max=Integer.MIN_VALUE;
        for(int i=last;i<=pre;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }
}
