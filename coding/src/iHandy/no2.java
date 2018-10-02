package iHandy;

import java.util.*;

/**
 * @author Fz
 * @date 2018/9/27 10:28
 */
public class no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(sc.next());
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ((o1+o2).compareTo(o2+o1) > 0) {
                    return -1;
                } else if ((o1+o2).compareTo(o2+o1) < 0) {
                    return 1;
                }
                return 0;
            }
        });
        StringBuffer res=new StringBuffer();
        for (String s:arr) {
            res.append(s);
        }
        if(res.charAt(0)=='0'){
            System.out.println(0);
        }else{
            System.out.println(res);
        }
    }
}
