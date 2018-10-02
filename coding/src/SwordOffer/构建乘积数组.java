package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/25 9:21
 */
public class 构建乘积数组 {
    public int[] multiply(int[] A) {
        int length=A.length;
        int[] b=new int[length];
        if(length!=0){
            b[0]=1;
            for(int i=1;i<length;i++){
                b[i]=b[i-1]*A[i-1];
            }
            int temp=1;
            for(int j=length-2;j>=0;j--){
                temp *=A[j+1];
                b[j]*=temp;
            }
        }
        return b;
    }
}
