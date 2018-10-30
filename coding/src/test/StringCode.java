package test;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author Fz
 * @date 2018/9/6 17:54
 */
public class StringCode {
    private static int count=0;
    public static void main(String[] args) {
        int a=0;
        int b=1;
    }
    public static Integer sum(int[] arr){
            if(arr.length<1) return null;
            if(arr.length==1) return arr[0];
            int start=0;
            int end=1;
            int sum=arr[0];
            int max=arr[0];
            while(end<arr.length){
                sum=sum+arr[end++];
                if(sum>=0){
                    max=Math.max(sum,max);
                }else{
                    sum=0;
                }
            }
            return max;
    }

}
class Preson{
    String name;
    int age;
    public Preson(){}
    public Preson(String s,int n){
        this.name=s;
        this.age=n;
    }
    public boolean equals(Object object){
        if(this==object){
            return true;
        }
        if(object instanceof Preson){
            Preson temp=(Preson) object;
            if(name.equals(temp.name)&&(age==temp.age)){
                return true;
            }
        }
        return false;
    }
    public static void f(){
        System.out.println("A");
    }
}
class b extends Preson{

    public b(){
        super();
    }

    public b(String s, int n) {
        super(s, n);
    }
    public static void f(){
        System.out.println("B");
    }

}