package Codeforces;
import java.util.*;
public class chatroom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String c = "hello";
        int k = 0;
        int p = 0;
        for(int i = 0 ; i < s.length(); i ++){
            if(c.charAt(k) == s.charAt(i)){
                k++;
                p++;
            }
            if(p == 5){
                break;
            }
        }
        if(p == 5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
    }
}
