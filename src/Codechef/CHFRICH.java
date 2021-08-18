package Codechef;
import java.util.*;
public class CHFRICH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0 ; j < t; j ++){
            int A = in.nextInt();
            int B = in.nextInt();
            int X = in.nextInt();
            int r = B - A;
            int y = r / X;
            System.out.println(y);
        }
        in.close();
    }
}