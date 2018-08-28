package sort;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Fz
 * @date 2018/8/25 20:58
 */
public class insertSort {
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        PriorityQueue<Integer> p=new PriorityQueue(new numberComp());
        for (int i:arr) {
            p.add(i);
        }
        for (int i:p) {
            System.out.print(i);
        }

    }
}
class numberComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int a=(int)o1;
        int b=(int)o2;
        if(a-b>0) return -1;
        if(a-b==0) return 0;
        return 1;
    }
}
