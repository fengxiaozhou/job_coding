package dp;

public class sum {
    public static boolean sum(int[] arr,int i,int sum,int aim){
        if(i==arr.length){
            return sum==aim;
        }
        return sum(arr,i+1,sum,aim)||sum(arr, i+1, sum+arr[i], aim);
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{3,2,7,12},0,0,9));
    }
}
