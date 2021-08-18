package Codechef;
import java.util.*;
public class FLOW008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t; i++){
            int num = in.nextInt();
            if(num < 10){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println(-1);
            }
        }
        in.close();
    }
}
