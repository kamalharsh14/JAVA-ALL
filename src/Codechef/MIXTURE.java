package Codechef;
import java.util.*;
public class MIXTURE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a == 0){
                System.out.println("Liquid");
            }
            if(b == 0){
                System.out.println("Solid");
            }
            if(a > 0 && b > 0){
                System.out.println("Solution");
            }
        }

    }
}
