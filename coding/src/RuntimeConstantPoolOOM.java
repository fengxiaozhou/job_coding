import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzhou
 * @data 2018/07/11
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }

}
