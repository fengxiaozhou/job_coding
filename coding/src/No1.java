import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class No1 {
    public static int find(int[] arr,int target,int low,int high){
        if(target<arr[low]||target>arr[high]||low>high){
            return -1;
        }
        int mid=(low+high)>>1;
        if(arr[mid]>target){
            return find(arr,target,low,mid-1);
        }
        else if(arr[mid]<target){
            return find(arr,target,mid+1,high);
        }
        else return arr[mid];
    }
    public static int find2(int[] arr,int target,int low,int high){
        if(target<arr[low]||target>arr[high]||low>high){
            return -1;
        }
        int mid;
        while (low<=high){
            mid=(low+high)>>1;
            if(arr[mid]<target) low=mid-1;
            else if(arr[mid]>target) high=mid+1;
            else return mid;
        }
        return -1;
    }
}
