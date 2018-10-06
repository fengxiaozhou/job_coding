package cuj;

import java.util.concurrent.CountDownLatch;

/**
 * @author Fz
 * @date 2018/10/5 13:03
 */
public class countdownlatch {
    final static CountDownLatch num=new CountDownLatch(5);
    static int k=1;
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<5;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        int i=k;
                        k++;
                        System.out.println(i+"go");
                        sleep((1000*(long)Math.random()));
                        System.out.println(i+"end");
                        num.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        num.await();
        System.out.println("game over");

    }
}
