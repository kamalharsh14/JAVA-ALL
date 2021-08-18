package Codechef;
import java.util.*;
public class REMISS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Math.max(a, b)+" "+(a+b));
        }
        in.close();
    }
}
