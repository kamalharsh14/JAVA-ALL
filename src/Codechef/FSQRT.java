package Codechef;
import java.util.*;
public class FSQRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t; i++){
            int num = in.nextInt();
            System.out.println(Math.round(Math.sqrt(num)));
        }
        in.close();
    }
}
