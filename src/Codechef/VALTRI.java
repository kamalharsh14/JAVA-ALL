package Codechef;
import java.util.*;
public class VALTRI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N % 5 == 0 || N % 6 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        in.close();
    }
}