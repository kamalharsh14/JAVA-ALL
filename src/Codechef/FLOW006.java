package Codechef;
import java.util.*;
public class FLOW006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        for(int i = 0 ; i < t ; i++){
            int num = in.nextInt();
            while(num != 0){
                int d = num%10;
                sum = sum+d;
                num = num/10;
            }
            System.out.println(sum);
            sum = 0;
        }
        in.close();
    }
}
