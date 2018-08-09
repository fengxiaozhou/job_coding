public class single_number_ii {
    public int singleNumber(int[] A) {
        int result=0;
        for(int j=0;j<32;j++){
            int bit=0;
            for(int i=0;i<A.length;i++){
                bit+=((A[i]>>j)&1);
            }
            result|=(bit%3)<<j;
        }

        return result;
    }

}
