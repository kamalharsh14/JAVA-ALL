package Codechef;
import java.util.*;
public class DIFACTRS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int counter = 0;
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 1 ; i <= N ; i++){
            if(N % i == 0){
                A.add(i);
                counter++;
            }
        }
        System.out.println(counter);
        for(int i = 0 ; i < A.size(); i++){
            System.out.print(A.get(i)+" ");
        }
        in.close();
    }
}
