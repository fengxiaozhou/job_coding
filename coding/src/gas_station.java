public class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] a=new int[gas.length];
        int sum=0;
        int max=0;
        int index=0;
        for (int i=0;i<gas.length;i++) {
            a[i]=gas[i]-cost[i];
            sum=sum+a[i];
        }
        if(sum<0){
            return -1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                index=i;
                int temp=i;
                for(int j=0;j<a.length;j++){
                    sum=sum+a[temp];
                    if(sum<0){
                        break;
                    }else {
                        if(temp==a.length-1){
                            temp=0;
                        }else {
                            temp++;
                        }
                    }
                }
                if(sum>=0){
                    max=index;
                }
            }
        }
        return max;
    }
}
