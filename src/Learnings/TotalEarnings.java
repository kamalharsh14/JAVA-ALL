package Learnings;

import java.util.Scanner;

public class TotalEarnings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double cp[] = new double[n];
        double sp[] = new double[n];
        double stocks[] = new double[n];
        int i = 0;
        double total = 0;
        while(i < n){
            cp[i] = in.nextDouble();
            sp[i] = in.nextDouble();
            stocks[i] = in.nextDouble();
            total = total + (sp[i] * stocks[i]) - (cp[i]*stocks[i]);
            i++;
        }
        if(total < 0){
            System.out.println("Better Luck tomorrow!");
        }
        else{
            System.out.println(total);
        }
        in.close();
    }
}