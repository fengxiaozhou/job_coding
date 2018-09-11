import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Fz
 * @date 2018/8/15 14:14
 */
public class test3 extends path_sum {
    public static void main(String[] args) throws InterruptedException {
        Thread a=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        a.start();
        System.out.println(Thread.currentThread());
        a.join();
        a.start();
    }
}
