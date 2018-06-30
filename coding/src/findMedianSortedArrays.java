/**
 * @author fengzhou
 * @data 2018/06/29
 */
public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] a={1};
        int[] b={1};
        System.out.print(find(a,b));
    }

    public static double find(int A[], int B[]){
        int sumsize=A.length+B.length;
        int[] sumArray=new int[sumsize];
        if( A.length==0 || A==null){
            sumArray=B;
        }else if(B.length==0 || B==null){
            sumArray=A;
        }else {
            int a = 0;
            int b = 0;
            for (int i = 0; i < sumsize; i++) {
                if ((a < A.length) && (b < B.length) &&A[a] >= B[b]) {
                    sumArray[i] = B[b];
                    b = b + 1;
                    continue;
                } else if ((a < A.length) && (b < B.length) && A[a] < B[b]) {
                    sumArray[i] = A[a];
                    a = a + 1;
                    continue;
                } else if (a == A.length) {
                    sumArray[i] = B[b];
                    b = b + 1;
                    continue;
                } else {
                    sumArray[i] = A[a];
                    a = a + 1;
                    continue;
                }
            }
        }
        if(sumsize%2 !=0){
            return sumArray[sumsize/2];
        }else{
            return (sumArray[sumsize/2]+sumArray[sumsize/2-1])/2.0;
        }
    }
}
