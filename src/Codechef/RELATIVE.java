package Codechef;
import java.util.*;
public class RELATIVE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int g = in.nextInt();
            int c = in.nextInt();
            System.out.println((c*c)/(2*g));
        }
        in.close();
    }
}
