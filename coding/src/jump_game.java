import java.sql.Array;

public class jump_game {
    public boolean canJump(int[] A) {
        if(A.length==0||A.length==1) return true;
        int l=A.length;
        int last=A.length-1;
        for(int i=l-2;i>=0;i--){
            if(i+A[i]>=last){
                last=i;
            }
        }
        return last==0;
    }
}
