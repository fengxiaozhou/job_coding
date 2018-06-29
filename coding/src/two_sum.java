import java.util.Arrays;
import java.util.HashMap;

/**
 * @author fengzhou
 * @data 2018/06/29
 */
public class two_sum {
    public static void main(String[] args) {
        int[] numbers={3,2,4};
        int target=6;
        System.out.print(Arrays.toString(twoSumwithHashmap(numbers,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] resultArray=new int[2];
        int a=0;
        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<numbers.length;j++) {
                if((numbers[i]+numbers[j]==target)&&(a!=1)&&(i!=j)){
                    resultArray[0]=i+1;
                    resultArray[1]=j+1;
                    a=1;
                }
            }
        }
        return resultArray;
    }

    public static int[] twoSumwithHashmap(int[] numbers,int target){
        int[] resultArray=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++){
            if(hashMap.containsKey(numbers[i])){
                resultArray[0]=hashMap.get(numbers[i])+1;
                resultArray[1]=i+1;
                return resultArray;
            }
            hashMap.put(target-numbers[i],i);
        }
        return null;
    }
}



