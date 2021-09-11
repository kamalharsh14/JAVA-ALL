package Codeforces;

import java.util.Scanner;

public class petyastrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        if(s1.compareToIgnoreCase(s2) == 0){
            System.out.println(0);
        }
        if(s1.compareToIgnoreCase(s2) > 0){
            System.out.println(1);
        }
        if(s1.compareToIgnoreCase(s2) < 0){
            System.out.println(-1);
        }
        in.close();
    }
}
