package Codechef;
import java.util.*;
public class HOOP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t; i ++){
            int n = in.nextInt();
            System.out.println((n/2)+1);
        }
        in.close();
    }
}
