package Codechef;
import java.util.*;
public class COCONUT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int xa = in.nextInt();
            int xb = in.nextInt();
            int Xa = in.nextInt();
            int Xb = in.nextInt();
            System.out.println((Xa/xa)+(Xb/xb));
        }
        in.close();
    }
}
