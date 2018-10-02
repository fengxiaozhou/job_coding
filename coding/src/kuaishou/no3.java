package kuaishou;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/25 20:16
 */
public class no3 {
    public static void main(String[] args) {
        PriorityQueue<good> queue = new PriorityQueue<>(
                new Comparator<good>() {
                    @Override
                    public int compare(good o1, good o2) {
                        int res=0;
                        if((o1.len - o2.len)<0&&(o1.wight-o2.wight)<0){
                            res=-1;
                        }else if((o1.len-o2.len)==0&&(o1.wight-o2.wight)==0){
                            res=0;
                        }else if((o1.len - o2.len)<0&&(o1.wight-o2.wight)>0){
                            res=-1;
                        }else if((o1.len - o2.len)>0&&(o1.wight-o2.wight)<0){
                            res=1;
                        }else{
                            res=1;
                        }
                        return res;
                    }
                }
        );

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        good temp;
        int a;
        int b;
        for (int i = 0; i < num; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            temp=new good(a,b);
            queue.add(temp);
        }
        int count=1;
        temp=queue.poll();
        while (!queue.isEmpty()){
            if((temp.len<=queue.peek().len)&&(temp.wight<=queue.peek().wight)){
                temp=queue.poll();
                count++;
            }else {
                queue.poll();
            }
        }
        System.out.println(count);

    }

}

class good implements Comparable{
    int len;
    int wight;

    public good(int a,int b){
        len=a;
        wight=b;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}