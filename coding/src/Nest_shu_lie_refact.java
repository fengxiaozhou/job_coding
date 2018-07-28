import java.util.*;

public class Nest_shu_lie_refact {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            a.add(i + 1);
            if (arr[i] != n) {
                b.add(arr[i]);
            }
        }
        a.removeAll(b);


        List<ArrayList<Integer>> perm = new ArrayList<ArrayList<Integer>>();
        calperm(perm, a, 0);

        for (ArrayList<Integer> x : perm) {
            int[] copy = new int[n];
            copy = Arrays.copyOf(arr, n);
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (copy[i] == 0) {
                    copy[i] = x.get(j);
                    j++;
                }
            }
            if (k == numlist(copy))
                res++;
        }
        System.out.print(res);
    }

    public static int numlist(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    num++;
                }
            }
        }
        return num;
    }

    /*计算全排序~~
     */
    public static void calperm(List<ArrayList<Integer>> perm, ArrayList<Integer> list, int n) {
        if (n == list.size()) {
            perm.add(new ArrayList<Integer>(list));
        } else {
            for (int i = n; i < list.size(); i++) {
                Collections.swap(list, i, n);
                calperm(perm, list, n + 1);
                Collections.swap(list, i, n);
            }
        }
    }

}
