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
    public static class MyCallable implements Callable<Integer> {
        public Integer call() {
            return 123;
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyCallable mc = new MyCallable();
//        FutureTask<Integer> ft = new FutureTask<>(mc);
//        Thread thread = new Thread(ft);
//        thread.start();
//        System.out.println(ft.get());
        Random r=new Random();
        System.out.println(r.nextInt(123));
    }

}
