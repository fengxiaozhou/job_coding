import java.util.*;
import java.util.stream.Collectors;

/**
 * @author fengzhou
 * @data 2018/07/06
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        List<ArrayList<Integer>> alist=new ArrayList<ArrayList<Integer>>();
        allList(alist,a,0);

        Scanner sc = new Scanner(System.in);
        System.out.print(sc.nextLine());
    }

    public static void allList(List<ArrayList<Integer>> alist,ArrayList<Integer> List ,int n){
        if(n==List.size()){
            alist.add(new ArrayList<>(List));
        }else{
            for(int i=n;i<List.size();i++){
                Collections.swap(List,i,n);
                allList(alist,List,n+1);
                Collections.swap(List,i,n);
            }
        }

    }
}
