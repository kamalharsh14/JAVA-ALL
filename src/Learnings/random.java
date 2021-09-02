package Learnings;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int countm1 = 0, countm2 = 0, countm1m2 = 0;
        for(int i = 1; i <= n ; i ++){
            if(i % m1 == 0 && i % m2 == 0){
                System.out.print("HappyCoding ");
                countm1m2++;
            }
            else if(i % m1 == 0 && i % m2 != 0){
                System.out.print("Happy ");
                countm1++;
            }
            else if(i % m1 != 0 && i % m2 == 0){
                System.out.print("Coding ");
                countm2++;
            }
            else{
                System.out.print(i+" ");
            }
            
        }
        System.out.println("\nHappy - "+countm1);
        System.out.println("Coding - "+countm2);
        System.out.println("HappyCoding - "+countm1m2);
        in.close();
    }
}
