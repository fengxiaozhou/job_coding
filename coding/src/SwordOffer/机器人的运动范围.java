package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/24 19:54
 */
public class 机器人的运动范围 {
    public int movingCount(int threshold, int rows, int cols)
    {
       int[][] flag=new int[rows][cols];
       return helper(0,0,rows,cols,flag,threshold);
    }
    private int helper(int i,int j,int rows,int cols,int[][] flag,int threshold){
        if(i<0||i>=rows||j<0||j>=cols||numsum(i)+numsum(j)>threshold||flag[i][j]==1)
            return 0;
        flag[i][j]=1;
        return helper(i-1,j,rows,cols,flag,threshold)+
                helper(i+1,j,rows,cols,flag,threshold)+
                helper(i,j-1,rows,cols,flag,threshold)+
                helper(i,j+1,rows,cols,flag,threshold)+
                1;
    }
    private int numsum(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
