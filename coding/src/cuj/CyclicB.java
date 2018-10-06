package cuj;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Fz
 * @date 2018/10/5 14:07
 */
public class CyclicB {
    final static CyclicBarrier num=new CyclicBarrier(5);

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        for(int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getId()+"准备好了~~~");
                    try {
                        num.await();
                        System.out.println(Thread.currentThread().getId()+"go~~~");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        System.out.println("一直等待到大家都好了~~~~~~~~");
    }
}
