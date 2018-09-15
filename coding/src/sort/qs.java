package sort;

/**
 * @author Fz
 * @date 2018/9/12 18:53
 */
public class qs {
    public static void qs(int arr[]){
        if(arr==null||arr.length==0){
            return;
        }
        qs(arr,0,arr.length-1);
    }
    public static void qs(int arr[],int l,int r){
        if(l<r){
            swap(arr,l+(int)(Math.random()*(r-l+1)),r);
            int[] p=partition(arr,l,r);
            qs(arr,l,p[0]);
            qs(arr,p[1]+1,r);
        }
    }
    public static int[] partition(int[] arr,int l,int r){
        int less=l-1;
        int more=r;
        while(l<more){
            if(arr[l]<arr[r]) swap(arr,++less,l++);
            if(arr[l]>arr[r]) swap(arr,--more,l);
            if (arr[l]==arr[r]) l++;
        }
        swap(arr,more,r);
        return new int[]{less,more};
    }

    public static void swap(int arr[],int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        qs(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
