package Codechef;
import java.util.*;
public class RNGEODD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        for(int i = L; i <= R ; i ++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        in.close();
    }
}
