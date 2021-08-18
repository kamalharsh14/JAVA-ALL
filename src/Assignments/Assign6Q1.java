package Assignments;

import java.util.*;

public class Assign6Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int n = in.nextInt();
        int space = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            int counter = n;
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(counter);
                if (j >= (2 * i - 1) / 2) {
                    counter++;
                } else {
                    counter--;
                }
            }
            System.out.println();
        }
        for (int i = n-1 ; i > 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            int counter = n;
            for (int j = 0 ; j < 2 * i - 1 ; j++) {
                System.out.print(counter);
                if(j >= (2 * i - 1)/2){
                    counter++;
                }
                else{
                    counter--;
                }
            }
            System.out.println();
        }
        in.close();
    }
}
