package Codechef;
import java.util.*;
public class TEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 0;
        ArrayList<Integer> a = new ArrayList<>();
        do{
            N = in.nextInt();
            a.add(N);
        }
        while(N != 42);
        for(int i = 0 ; i < a.size()-1; i++){
            System.out.println(a.get(i));
        }
        in.close();
    }
}
