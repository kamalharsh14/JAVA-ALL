package Codechef;
import java.util.*;
public class FLOW018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int num = in.nextInt();
            int fact = 1;
            for(int j = 1; j <= num; j++){
                fact = fact*j;
            }
            System.out.println(fact);
        }
        in.close();
    }
}
