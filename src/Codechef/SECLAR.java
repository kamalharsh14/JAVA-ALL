package Codechef;
import java.util.*;
public class SECLAR {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        if(A < Math.max(B, C) && A > Math.min(B, C)){
            System.out.println(A);
        }
        if(B < Math.max(A, C) && B > Math.min(A, C)){
            System.out.println(B);
        }
        if(C < Math.max(B, A) && C > Math.min(B, A)){
            System.out.println(C);
        }
        in.close();
    }
}
