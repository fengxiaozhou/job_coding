/**
 * @author Fz
 * @date 2018/9/5 11:47
 */
public class first_missing_positive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }
    public static int firstMissingPositive(int[] A) {
        int i=0;
        int n=A.length;
        int temp=0;
        while(i<n){
            if(A[i]>0&&A[i]<=n&&A[A[i]-1]!=A[i]){
                swap(A,i,A[i]-1);
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(A[j]!=j+1){
                i=j+1;
                return i;
            }
        }
        return n+1;
    }
    public static void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}
