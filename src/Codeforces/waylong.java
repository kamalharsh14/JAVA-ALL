package Codeforces;

import java.util.Scanner;

public class waylong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0){
            String s = in.next();
            int len = s.length();
            String ss = "";
            if(len > 10){
                ss = s.charAt(0)+ Integer.toString(len-2) + s.charAt(len-1);
                System.out.println(ss);
            }
            else{
                System.out.println(s);
            }
        }
        in.close();
    }
}
