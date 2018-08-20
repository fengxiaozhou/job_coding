/**
 * @author Fz
 * @date 2018/8/20 20:21
 */
public class trapping_rain_water {
    public int trap(int[] A) {
        int maxhig=0;
        int left=0,right=0;
        int sum=0;
        for(int i=0;i<A.length;i++){
            if(A[maxhig]<A[i]){
                maxhig=i;
            }
        }
        for(int i=0;i<maxhig;i++){
            if(A[i]<left){
                sum+=(left-A[i]);
            }else{
                left=A[i];
            }
        }
        for(int i=A.length;i>maxhig;i--){
            if(A[i]<right){
                sum+=(right-A[i]);
            }else{
                right=A[i];
            }
        }
        return sum;
    }
}
