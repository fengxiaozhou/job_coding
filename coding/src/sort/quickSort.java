package sort;

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
            quickSort(arr,l,p[0]-1);
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
        return new int[]{less+1,more};
    }

    public static void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        quickSort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
