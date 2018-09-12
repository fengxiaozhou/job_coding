package dx;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/10 9:21
 */
public class test {
    static class good implements Comparable{
        int a;
        int b;
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        @Override
        public int compareTo(Object  o) {
            int t=0;
            good temp=(good) o;
            if(b>temp.b) t=-1;
            if(b<temp.b) t=1;
            if(b==temp.b) t=0;
            return t;
        }
    }
    public static void main(String[] args){
        Queue<good> q=new PriorityQueue<>(
//                new Comparator<good>() {
//            @Override
//            public int compare(good o1, good o2) {
//                if(o1.b-o2.b>0) return 1;
//                else if (o1.b-o2.b==0)return 0;
//                else  return -1;
//            }
//        }
        );
        int n=4;
        Scanner sc=new Scanner(System.in);
        while(--n>0){
            good G=new good();
            G.a=sc.nextInt();
            G.b=sc.nextInt();
            q.add(G);
        }
        while (!q.isEmpty()){
            good g=q.poll();
            System.out.println(g.a+" "+g.b);
        }


    }
}
class Test1{
    public static int a=10;
    static {
        System.out.println(a);
    }
}