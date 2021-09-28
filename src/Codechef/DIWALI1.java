package Codechef;
import java.util.*;
public class DIWALI1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int p = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            
            int min = Math.min(b+ x*a, c + y*a);
            
            System.out.println(p/min);
        }
        in.close();
    }
}
