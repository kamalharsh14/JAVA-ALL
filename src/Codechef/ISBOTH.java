package Codechef;

import java.util.*;

public class ISBOTH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String Disp = "NONE";
        if(N % 5 == 0 || N % 11 == 0){
            Disp = "ONE";
        }
        if(N % 5 == 0 && N % 11 == 0){
            Disp = "BOTH";
        }
        if(N % 5 != 0 && N % 11 != 0){
            Disp = "NONE";
        }
        System.out.println(Disp);
        in.close();
    }
}