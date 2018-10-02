package reflect;

import java.lang.reflect.Method;

/**
 * @author Fz
 * @date 2018/9/16 23:30
 */
class Person {
    private String name;
    private int age;
    private String msg="hello wrold";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    private Person(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void fun() {
        System.out.println("fun");
    }

    public void fun(String name,int age) {
        System.out.println("我叫"+name+",今年"+age+"岁");
    }
}

public class ReflectDemo {
    public static void main(String[] args){
        try {
            Class c = Class.forName("reflect.Person");
            Object o = c.newInstance();
            Method[] methods=c.getMethods();
            for (Method m:methods
                 ) {
                System.out.println(m.getName());
            }
            Method method = c.getMethod("fun", String.class, int.class);
            method.invoke(o,"tengj", 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
