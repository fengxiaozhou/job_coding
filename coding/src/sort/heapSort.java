package sort;

/**
 * @author Fz
 * @date 2018/8/25 23:05
 */
public class heapSort {
    public static void heapSort(int[] arr){

        if (arr==null||arr.length<2){
            return;
        }
        //建立一个size=数组长度的大根堆，这个大根堆的size就是数组长度
        int size = arr.length;
        //建立大根堆的过程
        for (int i = 0;i<arr.length;i++){
            heapInsert(arr,i);
        }
        //交换0位置和最后的数，因为在建立大根堆以后0位置的数已经是所有数最大
        swap(arr,0,--size);
        //循环，做0和--size（最后位置，就是每次size缩小后的最后位置）的交换
        while (size>0){
            //沉底操作
            heapify(arr,0,size);
            //交换
            swap(arr,0,--size);
        }
    }

    public static void heapify(int[] arr,int index,int size){
        //当前结点的左孩子
        int left = 2*index+1;
        //判断左孩子是否小宇size，小于就说明数组没有越界，如果左孩子越界有孩子肯定越界
        while (left<size){
            //设置一个最大的变量，他的初始值是左孩子和右孩子中的最大值
            int largest =left+1<size&&arr[left+1]>arr[left] ? left+1 : left;
            //判断当前结点和孩子节点最大值的大小，更新largest的值
            largest = arr[largest] > arr[index] ? largest:index;
            //如果largest还是index，说明当前结点的值就是此时大根堆的最大值
            if (largest == index ){
                break;
            }
            //否则 交换
            swap(arr,largest,index);
            //然后index变成largest在大根堆中的位置，继续下沉
            index = largest;
            left = 2*index+1;
        }
    }



    public static void heapInsert(int[] arr, int index){
        //这个判断条件两个作用，
        //第一个作用如果当前结点比父节点的值大，就交换
        //直到index=（index-1）/2说明到了根节点跳出循环
        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }
    }



    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,9,8,7,4,5};
        heapSort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
