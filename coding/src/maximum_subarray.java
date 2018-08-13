public class maximum_subarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] A) {
        int sum=0;
        int max=A[0];
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
