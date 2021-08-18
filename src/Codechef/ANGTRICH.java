package Codechef;
import java.util.*;
public class ANGTRICH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if( a+b+c == 180 && (a+b > c || a+c > b || b+c > a) && a > 0 && b > 0 && c > 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
    }
}
