package Codechef;
import java.util.*;
public class EXTRICHK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a+b > c && a+c > b && b+c > a){
            if(a > 0 && b > 0 && c > 0 && a == b && b == c){
                System.out.println(1);
            }
            if(a > 0 && b > 0 && c > 0 && ( a == b || b == c || c == a)){
                System.out.println(2);
            }
            if(a > 0 && b > 0 && c > 0 && (a != b && b != c && c != a)){
                System.out.println(3);
            }
        }
        else{
            System.out.println(-1);
        }
        in.close();
    }
}
