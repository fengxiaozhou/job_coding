package SwordOffer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Fz
 * @date 2018/9/24 15:15
 */
public class 数据流中的中位数 {
    static PriorityQueue<Integer> qMin=new PriorityQueue<>();
    static PriorityQueue<Integer> qMax=new PriorityQueue<>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            }
    );


    public static void main(String[] args) {
        int[] arr=new int[]{5,2,3,4,1,6,7,0,8};
        for (int i:arr) {
            Insert(i);
        }
        System.out.println(qMin);
        System.out.println(qMax);
        System.out.println(GetMedian());
    }
    public static void Insert(int num){
        if(qMin.isEmpty()){
            qMin.add(num);
        }else if(num<qMin.peek()){
            qMax.add(num);
        }else{
            qMin.add(num);
        }
        while(qMax.size()>qMin.size()+1){
            qMin.add(qMax.poll());
        }
        while(qMin.size()>qMax.size()+1){
            qMax.add(qMin.poll());
        }
    }

    public static float GetMedian(){
        if(qMax.size()== qMin.size()){
            return (float) ((qMax.peek()+qMin.peek())/2.0);
        }
        if(qMax.size()>qMin.size())
            return qMax.peek();
        return qMin.peek();
    }
}
