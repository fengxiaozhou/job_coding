import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Fz
 * @date 2018/9/5 9:16
 */
public class run_game {
    private final static int count=10;

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch begin=new CountDownLatch(1);
        final CountDownLatch end=new CountDownLatch(count);
        final ExecutorService exec= Executors.newFixedThreadPool(10);
        final ThreadLocal threadLocal=new ThreadLocal();
        StringBuffer s=new StringBuffer("123");
        threadLocal.set(s);

        for(int i=0;i<count;i++){
            final int num=i+1;
            Runnable run=new Runnable() {
                @Override
                public void run() {
                    try {
                        StringBuffer a= (StringBuffer) threadLocal.get();
                        a=a.append('q');
                        begin.await();
                        Thread.sleep((long)(Math.random()*1000));
                        System.out.println("NO:"+num+" arrive");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        end.countDown();
                    }
                }
            };
            exec.submit(run);
        }

        System.out.println("Game start...");
        begin.countDown();
        System.out.println(threadLocal.get());
        end.await();
        System.out.println("Game over...");
    }
}
