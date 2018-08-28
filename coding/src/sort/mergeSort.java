package sort;

/**
 * @author Fz
 * @date 2018/8/25 21:31
 */
public class mergeSort {
    public static void mergeSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int l,int r){
        if(l==r){
            return;
        }
        int mid=(l+r)>>1;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,mid,l,r);
    }

    public static void merge(int[]arr,int m,int l,int r){
        int[] help=new int[r-l+1];
        int p1=l;
        int p2=m+1;
        int i=0;
        while (p1<m+1&&p2<r+1){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<m+1){
            help[i++]=arr[p1++];
        }
        while (p2<r+1){
            help[i++]=arr[p2++];
        }
        for(int j=0;j<help.length;j++){
            arr[l+j]=help[j];
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        mergeSort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
