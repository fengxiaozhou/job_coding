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
     ThreadLocal<Long> longLocal=new ThreadLocal<>();
     ThreadLocal<String> stringLocal=new ThreadLocal<>();
     public void set(){
         longLocal.set(Thread.currentThread().getId());
         stringLocal.set(Thread.currentThread().getName());
     }
     public long getLong(){
        return  longLocal.get();
     }
    public String getString(){
        return  stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final test3 test=new test3();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());

        Thread thread1=new Thread(){
            public void run(){
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            }
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}

