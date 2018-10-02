package shunfeng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/17 21:08
 */
public class no2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        List arr3=new ArrayList<>();
        List arr4=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            arr1.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            arr2.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            arr3= arr1.subList(i+1,n);
            System.out.println(arr3.toString());
            int index=arr2.indexOf(arr1.get(i));
            arr4=arr2.subList(0,index);
            System.out.println(arr4.toString());
            for (Object j:arr3) {
                if(arr4.contains(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
