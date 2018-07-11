import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author fengzhou
 * @data 2018/07/06
 */
public class test {
    public static void main(String[] args) {
        List<String> ipList = Arrays.asList("123123,123,123,123,123,123,123".split(","));
        List<Integer> portSet =ipList.stream().map(i->i.length()).filter(i->i==6).collect(Collectors.toList());
        for (int i: portSet) {
            System.out.print(i);
        }

    }
}
