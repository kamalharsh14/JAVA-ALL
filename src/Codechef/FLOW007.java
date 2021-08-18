package Codechef;
import java.util.*;
public class FLOW007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i<=t; i++){
            int num = in.nextInt();
            int rev = 0;
            while(num != 0){
                int digit = num % 10;
                rev = rev*10 + digit;
                num = num/10;
            }
            System.out.println(rev);
        }
        in.close();
    }
}
