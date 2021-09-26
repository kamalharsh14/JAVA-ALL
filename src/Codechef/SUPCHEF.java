package Codechef;

import java.util.*;

public class SUPCHEF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int m = in.nextInt();
            int n = in.nextInt();
            int k = in.nextInt();
            if((k*n) < m){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}