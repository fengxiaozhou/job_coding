package SwordOffer;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Fz
 * @date 2018/9/24 21:29
 */
public class 字符流中第一个不重复的字符 {
    LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<>();
    public void Insert(char ch)
    {
        if(linkedHashMap.containsKey(ch)){
            linkedHashMap.put(ch,linkedHashMap.get(ch)+1);
        }else{
            linkedHashMap.put(ch,1);
        }
    }
    public char FirstAppearingOnce(){
        if(linkedHashMap.isEmpty()){
            return '#';
        }
        Set<Map.Entry<Character, Integer>> entries= linkedHashMap.entrySet();
        for (Map.Entry e:entries) {
            if((int)e.getValue()==1){
                return (char)e.getKey();
            }
        }
        return '#';
    }

}
