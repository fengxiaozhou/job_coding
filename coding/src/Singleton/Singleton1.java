package Singleton;

/**
 * @author Fz
 * @date 2018/8/17 22:00
 */
public class Singleton1 {
    private static Singleton1 instance=new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return instance;
    }
}
