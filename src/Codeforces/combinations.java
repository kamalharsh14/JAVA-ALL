package Codeforces;
import java.util.*;

public class combinations{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
                if((a + b + c) - m >= 3){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
        }
        in.close();
    }
}