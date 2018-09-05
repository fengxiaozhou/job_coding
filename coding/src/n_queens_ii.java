/**
 * @author Fz
 * @date 2018/9/4 20:16
 */
public class n_queens_ii {
    int sum=0;
    int[] x;
    public int totalNQueens(int n) {
        x = new int[n+1];
        backtrack(1,n);//回溯算法开始，第一个皇后放下
        return sum;
    }
    void backtrack(int t,int num){
        if(t>num) //num为皇后的数目
            sum++;//sum为所有的可行的解
        else{
            for(int i = 1;i<=num;i++){//每个皇后都遍历所有点,O(n2)
                x[t] = i;//寻找这个皇后可以放置的所有点
                if(place(t))
                    backtrack(t+1,num);//如果成立，进入下一级递归，放下一个皇后
            }               //如果不成立，放其他位置，若都无法放，跳回上级递归
        }
    }
    boolean place(int k){
        for(int j = 1;j<k;j++)
            if(Math.abs(x[k] - x[j]) == Math.abs(k-j)||x[j] == x[k])
                return false;
        return true;
    }
}
