package Codechef;
import java.util.*;
public class MXEVNSUB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i< t ; i ++){
            int N = in.nextInt();
            int sum = 0, counter = 0;
            for(int j = 1; j <= N; j++){
                sum = sum + j;
                if(sum % 2 == 0){
                    counter = j;
                }
            }
            System.out.println(counter);
        }
        in.close();
    }
}
