package sort;

/**
 * @author Fz
 * @date 2018/10/19 9:04
 */
public class Ms {
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        ms(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void ms(int[] arr){
        if(arr==null||arr.length<2) return;
        mergeSort(arr,0,arr.length-1);
    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l==r) return;
        int mid=(l+r)>>1;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int[] help=new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=mid+1;
        while (p1<mid+1&&p2<r+1){
           help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<mid+1){
            help[i++]=arr[p1++];
        }
        while (p2<r+1){
            help[i++]=arr[p2++];
        }
        for(int j=0;j<help.length;j++){
            arr[l+j]=help[j];
        }
    }

}
