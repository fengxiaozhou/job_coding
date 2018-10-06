package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/6 14:57
 */
public class 旋转数组的最小数字 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length-2;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }
}
