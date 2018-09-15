package OverloadOverride;

import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/9/14 8:58
 */
class Animal{
    static final StringBuilder s=new StringBuilder("10");
    private void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    protected   void move(){
        s.append("123");
        System.out.println("狗可以跑和走");
    }
}
public class Override {
        public static void main(String args[]){
            ArrayList<Object> a=new ArrayList();
            while(true){
                a.add(new Object());
            }
        }
    }

