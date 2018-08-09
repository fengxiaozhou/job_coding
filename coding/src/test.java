import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @author fengzhou
 * @data 2018/07/06
 */
public class test {
    static Vector<Integer> al=new Vector<Integer>(10);
    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Integer> a=new ArrayList<Integer>();
//        a.add(1);
//        a.add(3);
//        a.add(5);
//        List<ArrayList<Integer>> alist=new ArrayList<ArrayList<Integer>>();
//        allList(alist,a,0);

//        int a=8;
//        for(int i=0;i<32;i++){
//            int t=(a & 0x80000000>>>i)>>>(31-i);
//            System.out.print(t);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print(sc.nextLine());
       Thread t1=new Thread(new a());
       Thread t2=new Thread(new a());
       t1.start();
       t2.start();
       t1.join();
       t2.join();
       System.out.print(al.size());
    }

    public static void allList(List<ArrayList<Integer>> alist,ArrayList<Integer> List ,int n){
        if(n==List.size()){
            alist.add(new ArrayList<>(List));
        }else{
            for(int i=n;i<List.size();i++){
                Collections.swap(List,i,n);
                allList(alist,List,n+1);
                Collections.swap(List,i,n);
            }
        }

    }

    public static class a implements Runnable{


        @Override
        public void run() {
            for(int i=0;i<100000;i++){
                al.add(i);
            }
        }
    }
}
