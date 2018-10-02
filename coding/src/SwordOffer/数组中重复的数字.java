package SwordOffer;

import java.util.LinkedHashMap;

/**
 * @author Fz
 * @date 2018/9/25 9:48
 */
public class 数组中重复的数字 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] flag=new int[length];
        for(int i=0;i<length;i++){
            if(flag[numbers[i]]==0){
                flag[numbers[i]]++;
            }else{
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}
