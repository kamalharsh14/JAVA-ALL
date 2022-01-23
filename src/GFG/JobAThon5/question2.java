package GFG.JobAThon5;
import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i ++){
            arr[i] = in.nextInt();
        }
        String s = in.next();
        int ans = solve(n,s,arr);
        System.out.println(ans);
        in.close();
    }
    static int solve(int N, String s, int [] C){
        char f = s.charAt(0);
        char se = s.charAt(1);
        int cost = 0;
        boolean flip = true;
        if(f == se){
            for(int i = 2 ; i < s.length(); i ++){
                int counter = 2;
                if(flip){
                    while(counter-- > 0){
                        if(s.charAt(i) == se){
                            cost = cost + C[i];
                        }
                    }
                    flip = false;
                }
                if(!flip){
                    while(counter-- > 0){
                        if(s.charAt(i) == f){
                            cost = cost + C[i];
                        }
                    }
                    flip = true;
                }
            }
            System.out.println("hitting if");
        }
        else{
            flip = true;
            for(int i = 2 ; i < s.length(); i ++){
                if(!flip){
                        if(s.charAt(i) == f){
                            cost = cost + C[i];
                        }
                    flip = true;
                }
                if(flip){
                        if(s.charAt(i) == se){
                            cost = cost + C[i];
                        }
                    flip = false;
                }
            }
            System.out.println("hitting else");
        }
        return cost;
    }
}
