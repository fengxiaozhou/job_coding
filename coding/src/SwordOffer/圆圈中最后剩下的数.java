package SwordOffer;

import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/9/25 13:19
 */
public class 圆圈中最后剩下的数 {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0){
            return -1;
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(i);
        }
        int temp=(m-1)%arr.size();
        while (arr.size()!=1){
            arr.remove(temp);
            temp=(temp+(m-1))%arr.size();
        }
        return arr.get(0);
    }
}
