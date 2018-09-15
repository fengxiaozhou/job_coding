package aqiyi;

import java.util.*;

/**
 * @author Fz
 * @date 2018/9/15 10:01
 */
public class no2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int P=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(i+1,sc.nextInt());
        }
        for(int i=0;i<M;i++){
            String s=sc.next();
            int num=sc.nextInt();
            if(s.equals("B")){
                map.put(num,map.get(num)-1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());

        Collections.sort(list,valueComparator);

        int num=0;
        int cur=Integer.MIN_VALUE;
        for (Map.Entry s:list) {
            if((Integer)s.getValue()!=cur){
                num++;
                cur=(Integer)s.getValue();
            }
            if((Integer)s.getKey()==P){
                System.out.println(num);
                return;
            }
        }

    }

    public static Comparator<Map.Entry<Integer, Integer>> valueComparator = new Comparator<Map.Entry<Integer,Integer>>() {
        @Override
        public int compare(Map.Entry<Integer, Integer> o1,
                           Map.Entry<Integer, Integer> o2) {
            // TODO Auto-generated method stub
            return o2.getValue()-o1.getValue();
        }
    };
}