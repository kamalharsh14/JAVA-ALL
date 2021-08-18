package Codechef;
import java.util.*;
public class MUFFINS3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int num = in.nextInt();
            if(num <= 2){
                System.out.println(num);
            }
            else{
                int mid = num/2;
                System.out.println(mid+1);
            }
        }
        in.close();
    }
}
