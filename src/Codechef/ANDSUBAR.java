package Codechef;
import java.util.*;
public class ANDSUBAR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int a = n;
            int count = 0;
            while(a > 0){
                count = count + 1;
                a = a>>1;
            }
            int ans1 = n -  (int)Math.pow(2, count-1) + 1;
            int ans2 = (int)Math.pow(2, count-1) - (int)Math.pow(2, count-2);
            System.out.println(Math.max(ans1, ans2));
        }
        in.close();
    }
}
