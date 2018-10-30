package Singleton;

/**
 * @author Fz
 * @date 2018/8/17 22:04
 */
public class Singleton3 {
    private  static volatile Singleton3 instance;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}
