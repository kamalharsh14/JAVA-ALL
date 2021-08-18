package Codechef;
import java.util.*;
public class EITA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int d = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(Math.max((x*7), ((d*y) + z* (7-d))));
        }
        in.close();
    }
}
