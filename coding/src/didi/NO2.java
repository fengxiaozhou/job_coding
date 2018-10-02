package didi;

import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/18 19:53
 */
public class NO2 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int np=sc.nextInt();
        int nq=sc.nextInt();
        int nr=sc.nextInt();
        boolean p=false;
        boolean q=false;
        boolean r=false;
        if(np!=0){
            p=true;
        }
        if(nq!=0){
            q=true;
        }
        if(nr!=0){
            r=true;
        }
        if(np==0&&nq==0&&nr==0) {
            System.out.println(0);
            return;
        }
        int sum=np+nq+nr;
        StringBuffer res=new StringBuffer();
        fun(np,nq,nr,sum,p,q,r,res);
        System.out.println(count);

    }
    public static void fun(int np,int nq,int nr,int sum,boolean p,boolean q,boolean r,StringBuffer res){
        if(sum==0){
            count++;
            System.out.println(res);
            return;
        }else if(p==false&&q==false&&r==false){
            return;
        }
        if(p==true){
            res.append("p");
            p=false;
            if(nq!=0){
                q=true;
            }else {
                q=false;
            }
            if(nr!=0){
                r=true;
            }else {
                r=false;
            }
            fun(np-1,nq,nr,sum-1,p,q,r,res);
            res.deleteCharAt(res.length()-1);
        }
        if(q==true){
            res.append("q");
            q=false;
            if(np!=0){
                p=true;
            }else {
                p=false;
            }
            if(nr!=0){
                r=true;
            }else {
                r=false;
            }
            fun(np,nq-1,nr,sum-1,p,q,r,res);
            res.deleteCharAt(res.length()-1);
        }
        if(r==true){
            res.append("r");
            r=false;
            if(nq!=0){
                q=true;
            }else {
                q=false;
            }
            if(np!=0){
                p=true;
            }else {
                p=false;
            }
            fun(np,nq,nr-1,sum-1,p,q,r,res);
            res.deleteCharAt(res.length()-1);
        }
    }
}
