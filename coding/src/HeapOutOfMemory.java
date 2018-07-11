import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzhou
 * @data 2018/07/11
 */
public class HeapOutOfMemory {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject>  list=new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
