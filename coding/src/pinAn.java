import java.util.*;

/**
 * @author Fz
 * @date 2018/10/10 21:27
 */
public class pinAn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<student> arr=new ArrayList<student>();
        String[] a;
        float sum=0;
        float count=0;
        int i=0;
        while (sc.hasNextLine()){
            student temp=new student();
            a=sc.nextLine().split(" ");
            temp.name=a[0];
            for (String s:Arrays.copyOfRange(a,1,a.length)) {
                sum+=Integer.valueOf(s);
                count++;
            }
            temp.avg=Math.round(sum/count);
            arr.add(temp);
            sum=0;
            count=0;
            i++;
        }
        Collections.sort(arr,new MyComparator());
        for (student s:arr) {
            System.out.println(s.name+" "+s.avg);
        }
    }

}
class student{
    String name;
    int avg;
}
class MyComparator implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o2.avg-o1.avg;
    }
}
