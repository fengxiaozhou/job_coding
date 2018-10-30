package Singleton;

/**
 * @author Fz
 * @date 2018/8/17 22:00
 */

/**
 * public class Singleton{
 *     private static Singleton instance=new Singleton();
 *     private Singleton(){}
 *     public static Singleton getInstance(){return instance;}
 * }
 *
 * public class Singleton2{
 *     private static Singleton instance;
 *     private Singleton(){}
 *     public static Singleton2 getInstance(){
 *         if(instance==null){
 *             instance=new Singleton();
 *         }
 *         return instance
 *     }
 * }
 *
 * public class Singleton3{
 *     private static volatile Singleton3 instance;
 *     private Singleton(){}
 *     public static Singleton2 getInstance(){
 *         if(instance==null){
 *             synchronized(Singleton3.class){
 *                 if(intstance==null){
 *                     instance=new Singleton3();
 *                 }
 *                 return instance;
 *             }
 *         }
 *     }
 * }
 *
 * public enum S{
 *     INSTANCE;
 *     private S {}
 * }
 */
public class Singleton1 {
    private static Singleton1 instance=new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return instance;
    }
}