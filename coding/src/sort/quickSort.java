package sort;

import java.util.Stack;

/**
 * @author Fz
 * @date 2018/8/25 21:58
 */
public class quickSort {
    public static void quickSort(int[] arr){
        if(arr==null||arr.length<2){
            return ;
        }
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int l,int r){
        if(l<r){
            swap(arr,l+(int)(Math.random()*(r-l+1)), r);
            int[] p=partition(arr, l, r);
            quickSort(arr,l,p[0]);
            quickSort(arr,p[1]+1,r);
        }
    }
    public static int[] partition(int[] arr,int l,int r){
        int less=l-1;
        int more=r;
        while(l<more){
            if(arr[l]<arr[r]){
                swap(arr,++less,l++);
            }else if(arr[l]>arr[r]){
                swap(arr,--more,l);
            }else{
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less,more};
    }

    public static void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }

    public static void quicks(int[] arr){
        if(arr==null||arr.length==1) return;
        Stack<Integer> s=new Stack<Integer>();
        s.push(0);
        s.push(arr.length-1);
        while(!s.empty()){
            int r=s.pop();
            int l=s.pop();
            if(r==l) continue;
            int i=partition1(arr,l,r);
            if(l<i-1) {
                s.push(l);
                s.push(i - 1);
            }
            if(i+1<r){
                s.push(i+1);
                s.push(r);
            }
        }
    }

    public static  int partition1 (int[] data, int first, int end){
        int temp;
        int i=first,j=end;
        if(first<end){
            temp=data[i];
            while (i<j){
                while (j>i&&data[j]>temp)
                    j--;
                if(i<j){
                    //将该元素赋值给temp
                    data[i]=data[j];
                    //赋值后就应该将i+1指向下一个序号
                    i++;
                }

                //然后从左边向右边开始扫描，找到一个大于temp的元素
                while(i<j&&temp>data[i])i++;
                if(i<j)
                {
                    //将该元素赋值给temp
                    data[j]=data[i];
                    //赋值后就应该将j-1指向前一个序号
                    j--;
                }
            }
            data[i]=temp;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        quicks(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
