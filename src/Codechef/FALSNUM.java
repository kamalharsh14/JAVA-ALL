package Codechef;
import java.util.*;
public class FALSNUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            String A = in.next();
            int len = A.length();
            String ns = "";
                if(A.charAt(0) == '1'){
                    ns = A.charAt(0) + "0" + A.substring(1, len);
                }
                else{
                    ns = "1" + A;
                }
                System.out.println(ns);
        }
        in.close();
    }
}
