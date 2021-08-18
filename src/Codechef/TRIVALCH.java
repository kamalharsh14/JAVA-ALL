package Codechef;
import java.util.*;
public class TRIVALCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double s = (a + b + c)/2;
        double Area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        if(((a + b) > c || (a + c) > b || (c + b) > a) && Area > 0 ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
    }
}
