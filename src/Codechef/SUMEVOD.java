package Codechef;
import java.util.*;
public class SUMEVOD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sumev = 0; int sumod = 0;
        for(int i = 0 ; i < 2*(N+1) ; i ++){
            if(i % 2 == 0){
                sumev = sumev + i;
            }
            else if(i  % 2 != 0 && i < 2*N){
                sumod = sumod + i;
            }
        }
        System.out.println(sumod + " " + sumev);
        in.close();
    }
}
