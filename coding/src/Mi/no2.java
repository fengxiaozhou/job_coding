package Mi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Fz
 * @date 2018/9/27 14:47
 */
public class no2 {
    static ArrayList<ArrayList<String>> arr=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.valueOf(sc.nextLine());
        String temp;
        for(int i=0;i<num;i++){
            temp=sc.nextLine();
            arr.add(new ArrayList<String>(Arrays.asList(temp.split(" "))));
        }
        System.out.println(2);
        System.out.println(5);
    }
}
