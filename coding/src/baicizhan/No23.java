package baicizhan;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/11 13:37
 */
public class No23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> Q=new PriorityQueue();
        HashMap<Integer,Integer> map=new HashMap();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            for(int j=0;j<num;j++){
                int a=sc.nextInt();
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put(a,1);
                    Q.add(a);
                }
            }
        }
        while (!Q.isEmpty()){
            int t=Q.poll();
            int count=map.get(t);
            for(int i=0;i<count;i++){
                System.out.print(t +"");
            }
        }
    }
}
