package Codechef;
import java.util.*;

class SHOEFIT{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int count = 0;
            if(a != b){
                count = 1;
            }
            if(a != c){
                count = 1;
            }
            System.out.println(count);
        }
        in.close();
    }
}