package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/6 17:54
 */
public class StringCode {
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        quicksort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void quicksort(int arr[]){
        quicksort(arr,0,arr.length-1);
    }
    public static void quicksort(int[] arr,int l,int r){
        if(l<r){
            swap(arr,l+(int)Math.random()*(r-l+1),r);
            int[] p=partition(arr,l,r);
            quicksort(arr,l,p[0]);
            quicksort(arr,p[1]+1,r);
        }
    }
    public static int[] partition(int[] arr,int l,int r){
        int less=l-1;
        int more=r;
        int i=l;
        while (i<more){
            if(arr[i]<arr[r])
                swap(arr,++less,i++);
            if(arr[i]>arr[r])
                swap(arr,--more,i);
            if(arr[i]==arr[r])
                i++;
        }
        swap(arr,more,r);
        int[] res=new int[]{less,more};
        return res;
    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
