package Codechef;
import java.util.*;
public class FLOW017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a > b && b > c || a < b && b < c){
                System.out.println(b);
            }
            if(a > c && c > b || a < c && c < b){
                System.out.println(c);
            }
            if(c > a && a > b || c < a && a < b){
                System.out.println(a);
            }
        }
        in.close();
    }
}
