package Codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BLITZ3_2 {
    public static void main(String[] args)throws IOException {
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(x);
        int t = Integer.parseInt(in.readLine());
        for(int j = 0 ; j < t ; j++){
            int N = Integer.parseInt(in.readLine());
            int A = Integer.parseInt(in.readLine());
            int B = Integer.parseInt(in.readLine());
            int time = 2*(180+N) - (A+B);
            System.out.println(time);
        }
    }
}
