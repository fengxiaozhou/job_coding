public class search_in_rotated_sorted_array {

    public static void main(String[] args) {
        System.out.print(search(new int[]{3,1,1},3));
    }
    public static boolean search(int[] A, int target) {
        if(A==null || A.length==0){
            return false;
        }
        int l=0;
        int r=A.length-1;
        while (l<r){
            int mid=l + (r-l)/2;

            if(A[mid] == target){
                return true;
            }

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
        if(A[l] == target){
            return true;
        }
        if(A[r] == target){
            return true;
        }
        return false;
    }
}
