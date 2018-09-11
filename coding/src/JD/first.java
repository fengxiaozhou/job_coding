package JD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Fz
 * @date 2018/9/9 20:29
 */
public class first {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<String> res = new ArrayList<>();
            while (n-- > 0) {
                int N = sc.nextInt();
                int M = sc.nextInt();
                int[][] arr = new int[N][N];
                for (int i = 0; i < M; i++) {
                    int a = sc.nextInt() - 1;
                    int b = sc.nextInt() - 1;
                    arr[a][b] = 1;
                    arr[b][a] = 1;
                }
                List<List<Integer>> collect = new ArrayList<List<Integer>>();
                boolean sign = true;
                for (int i = 0; i < N; i++) {
                    List<Integer> s = new ArrayList<>();
                    if (!isC(collect, i)) {
                        s.add(i);
                        for (int j = 0; j < N; j++) {
                            if (j != i && arr[i][j] == 0) {
                                if (isC(collect, j)) {
                                    sign = false;
                                    break;
                                }
                                s.add(j);
                            }
                        }
                        collect.add(s);
                    }
                }
                String s=sign ? "Yes" : "No";
                res.add(s);

            }
            for (String s : res) {
                System.out.println(s);
            }
        }

        public static boolean isC(List<List<Integer>> list, int node) {
            for (List subList : list) {
                for (Object a : subList) {
                    if (node == (Integer) a) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

