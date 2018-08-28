import java.util.HashMap;

/**
 * @author Fz
 * @date 2018/8/21 19:22
 */
public class word_search {
    public boolean exist(char[][] board, String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(!map.containsKey(board[i][j])){
                    map.put(board[i][j],1);
                }else{
                    map.put(board[i][j],map.get(board[i][j])+1);
                }
            }
        }
        for (char c:word.toCharArray()) {
            if(!map.containsKey(c)){
                return false;
            }else{
                if(map.get(c)==0){
                    return false;
                }else {
                    map.put(c,map.get(c)-1);
                }
            }
        }
        return true;
    }
}
