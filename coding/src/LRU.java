import sun.misc.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Fz
 * @date 2018/9/27 9:49
 */
public class LRU {
    public static void main(String[] args) {
        LRUcache cache = new LRUcache();
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.get(1);
        cache.put(4, "d");
        cache.put(5, "e");
        System.out.println(cache.keySet());
    }
}

class LRUcache extends LinkedHashMap{
    private static final int max=3;
    protected boolean removeEldestEntry(Map.Entry oldest){
        return size()>max;
    }

    LRUcache(){
        super(max,0.75f,true);
    }
}
