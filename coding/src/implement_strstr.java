/**
 * @author Fz
 * @date 2018/9/6 11:11
 */
public class implement_strstr {
    public String strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        if(index>-1)
            return haystack.substring(index);
        return null;
    }
}
