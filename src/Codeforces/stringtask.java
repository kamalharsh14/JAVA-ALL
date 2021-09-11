package Codeforces;
import java.util.*;
public class stringtask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s=  s.toLowerCase();
        String ss ="";
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y'){
                ss = ss+ "."+s.charAt(i);
            }
        }
        System.out.println(ss);
        in.close();
    }
}
