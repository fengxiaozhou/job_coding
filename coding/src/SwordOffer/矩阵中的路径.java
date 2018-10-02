package SwordOffer;

import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/9/24 16:29
 */
public class 矩阵中的路径 {

    public static void main(String[] args) {
        System.out.println(hasPath(new String("ABCESFCSADEE").toCharArray(),2,2,new String("ABCB").toCharArray()));
    }
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
//        if(Arrays.toString(matrix).equals(Arrays.toString(str))){
//            return true;
//        }
        int [][] mat=new int[rows][cols];
        boolean[][] bits=new boolean[rows][cols];
        int count=0;
        boolean res=false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=matrix[count];
                count++;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                bits[i][j]=true;
                if(helper(mat,i,j,str,rows,cols,0,bits)){
                    res=true;
                    break;
                }
                for (boolean[] b:bits) {
                    Arrays.fill(b,false);
                }
            }
        }
        return res;
    }

    public static boolean helper(int[][] mar,int i,int j,char[] str,int rows,int cols,int num,boolean[][] bits){
        if(mar[i][j]!=str[num]){
            return false;
        }
        if(num==str.length-1){
            return true;
        }
        boolean up=false,down=false,left=false,right=false;
        if(i>0&&(bits[i-1][j]==false)){
            bits[i-1][j]=true;
            up=helper(mar,i-1,j,str,rows,cols,num+1,bits);
            bits[i-1][j]=false;
        }
        if(i<rows-1&&(bits[i+1][j]==false)){
             bits[i+1][j]=true;
             down=helper(mar,i+1,j,str,rows,cols,num+1,bits);
             bits[i+1][j]=false;
        }
        if(j>0&&(bits[i][j-1]==false)){
            bits[i][j-1]=true;
            left=helper(mar,i,j-1,str,rows,cols,num+1,bits);
            bits[i][j-1]=false;
        }
        if(j<cols-1&&(bits[i][j+1]==false)){
            bits[i][j+1]=true;
            right=helper(mar,i,j+1,str,rows,cols,num+1,bits);
            bits[i][j+1]=false;
        }
        return (up||down||left||right);
    }
}
