import java.util.Scanner;
public class NestFindSubsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s2.length()==0){
            System.out.print("Yes");
        }
        int i=0;
        int j=0;
        while(i<s1.length()&&j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
                if(j==s2.length()){
                    System.out.print("Yes");
                    return;
                }
            }else{
                i++;
            }
        }
        System.out.print("No");
    }
}
