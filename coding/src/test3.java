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
    public static void main(String[] args) throws InterruptedException {
//        HashMap
//        ArrayList
//          LinkedList
        ConcurrentHashMap
        System.out.println(result());
    }
    public static int result(){
        int i=0;
        try{
            i=2;
            return i;
        }finally {
            i=i+1;
            System.out.println(i);
        }
    }
}

