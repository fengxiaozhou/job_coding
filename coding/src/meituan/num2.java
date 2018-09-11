package meituan;

import java.util.*;

/**
 * @author Fz
 * @date 2018/9/6 20:16
 */
public class num2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int t=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        if(n<k){
            if(isVidle(arr,t)){
                System.out.println(1);
                return;
            }else {
                System.out.println(0);
                return;
            }
        }
        int res=0;
        for(int i=0;i+k-1<n;i++){
            if(isVidle(new ArrayList<Integer>(arr.subList(i,i+k)),t))
                res++;
        }
        System.out.println(res);
    }

    public static boolean isVidle(ArrayList<Integer> arr ,int t){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int c:arr) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
                if(map.get(c)>=t){
                    return true;
                }
            }else{
                map.put(c,1);
            }
        }
        return false;
    }
}
