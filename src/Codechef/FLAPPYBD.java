package Codechef;
import java.util.*;
public class FLAPPYBD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int N = in.nextInt();
            int H = in.nextInt();
            int x[] = new int[N];
            int h[] = new int[N];
            for(int j = 0 ; j < N ; j ++){
                x[i] = in.nextInt();
            }
            for(int j = 0 ; j < N ; j ++){
                h[i] = in.nextInt();
            }
            int click = 0;
            for(int j = 0 ; j < N ; j ++){
                if(h[j] > H && x[j] == j){
                    click = click + h[i] - H ;
                    H = H+click;
                }
                H--;
                if(H < 1){
                    click++;
                    H++;
                }
                if(h[j] == H){
                    System.out.println(-1);
                    break;
                }
            }
            System.out.println(click);
        }
        in.close();
    }
}
