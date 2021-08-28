package Codechef;
import java.util.*;
public class PROGLANG{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i< t ; i ++){
            int A = in.nextInt();
            int B = in.nextInt();
            int A1 = in.nextInt();
            int B1 = in.nextInt();
            int A2 = in.nextInt();
            int B2 = in.nextInt();
            int c1 = 0, c2 = 0;
            if(A == A1 || A == B1){
                if(B == A1 || B == B1){
                    c1 = 1;
                }
            }
            if(A == A2 || A == B2){
                if(B == A2 || B == B2){
                    c2 = 1;
                }
            }
            if(c1 == 1){
                System.out.println(1);
                c1 = 0;
            }
            else if(c2 == 1){
                System.out.println(2);
                c2 = 0;
            }
            else{
                System.out.println(0);
            }
        }
        in.close();
    }
}