import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Fz
 * @date 2018/8/15 14:14
 */
public class test3 {
      private static BlockingQueue<String> queue=new ArrayBlockingQueue<String>(3);

      private static class P implements Runnable {

          @Override
          public void run() {
              try {
                  queue.put("good");
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println("+++");
          }

      }

      private static class C implements Runnable{

          @Override
          public void run() {
              try {
                  String s=queue.take();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println("---");
          }
      }
    static int j=0;
    public static void main(String[] args) throws InterruptedException {
//        HashMap
        TreeSet<Integer> set=new TreeSet<>();
        List a=new ArrayList();
        Collections.sort(a);
        set.add(2);
        set.add(76);
        set.add(9);
        set.add(1);
        for (int i:set) {
            System.out.println(i);
        }

    }
}
