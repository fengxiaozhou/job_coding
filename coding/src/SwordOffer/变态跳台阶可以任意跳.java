package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/6 15:09
 */
public class 变态跳台阶可以任意跳 {
    public int JumpFloorII(int target) {
        int[] arr=new int[target+3];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=target;i++){
            for(int j=0;j<i;j++){
                arr[i]+=arr[j];
            }
        }
        return arr[target];
    }
}
