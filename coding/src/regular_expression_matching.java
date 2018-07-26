public class regular_expression_matching {
    public static void main(String[] args) {
        System.out.print(isMatch("aab","c*a*b"));
    }
    public static boolean isMatch(String s, String p) {
      if(s.length()>p.length()){
          return false;
      }
      if(s.length()==p.length()){
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)!=p.charAt(i)){
                  if(p.charAt(i)!='.'&&p.charAt(i)!='*')
                      return false;
              }
          }
      }
      if(s.length()<p.length()){
          int i=0;
          int j=0;
          while(i<s.length()){
              if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='*'||p.charAt(j)=='.'){
                  i++;
                  j++;
              }else if(s.charAt(i)!=p.charAt(j)){
                  j++;
              }
              if(i==s.length()-1&&j<p.length()-1){
                  return true;
              }
              if(j==p.length()-1&&i!=s.length()-1){
                  return false;
              }
          }
      }
      return true;
    }
}
