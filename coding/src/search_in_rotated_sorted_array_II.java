/**
 * @author Fz
 * @date 2018/9/5 15:30
 */
public class search_in_rotated_sorted_array_II {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},1));
    }
    public static int search(int[] A, int target) {
        int l=0;
        int r=A.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(A[mid]==target) return mid;
            if(A[l]<A[mid]){
                if(A[l]<=target && target<=A[mid]){
                    r=mid;
                }else{
                    l=mid;
                }
            }else if(A[l]>A[mid]){
                if(A[mid]<=target && target<=A[r]){
                    l=mid;
                }else{
                    r=mid;
                }
            }else {
                l++;
            }
        }
        return -1;
    }
}
