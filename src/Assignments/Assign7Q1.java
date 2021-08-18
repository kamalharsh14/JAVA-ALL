package Assignments;

import java.util.*;

public class Assign7Q1 {
    public int maxarray(int[] myarray) {
        int maxval = 0;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] > maxval) {
                maxval = myarray[i];
            }
        }
        return maxval;
    }

    public int minarray(int[] myarray) {
        int minval = 0;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < minval) {
                minval = myarray[i];
            }
        }
        return minval;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the number of positive patients");
        int np = in.nextInt();
        Assign7Q1 ob = new Assign7Q1();
        int px[] = new int[np];
        int py[] = new int[np];
        int matp[][] = new int[np][np];
        System.out.println("\nEnter coordinates of positive patients");
        for (int i = 0; i < np; i++) {
            px[i] = in.nextInt();
            py[i] = in.nextInt();
        }
        System.out.println("\nEnter the number of negative patients");
        int nn = in.nextInt();
        int nx[] = new int[nn];
        int ny[] = new int[nn];
        int matn[][] = new int[nn][nn];
        System.out.println("\nEnter coordinates of negative patients");
        for (int i = 0; i < np; i++) {
            nx[i] = in.nextInt();
            ny[i] = in.nextInt();
        }
        int maxpx = ob.maxarray(px);
        int maxpy = ob.maxarray(py);
        int maxnx = ob.maxarray(nx);
        int maxny = ob.maxarray(ny);
        int minpx = ob.minarray(px);
        int minpy = ob.minarray(py);
        int minnx = ob.minarray(nx);
        int minny = ob.minarray(ny);
        int xmax = Math.max(maxpx, maxnx);
        int xmin = Math.min(minpx, minnx);
        int ymax = Math.max(maxpy, maxny);
        int ymin = Math.max(minny, minpy);
        System.out.println(" ");
        for(int i = 0 ; i < xmax ; i++){
            for(int j = 0 ; j < ymax; j++){
                if(px[i] == i && py[j] == j){
                    matp[i][j] = 1;
                }
                if(nx[i] == i && ny[j] == j){
                    matn[i][j] = -1;
                }
            }
        }
        for (int i = xmax; i >= xmin; i--) {
            if (i != 0) {
                if (i > 9) {
                    System.out.println(i + "|");
                } else {
                    System.out.println(i + " |");
                }
            } else {
                System.out.print(i + " |");
            }
        }
        for (int i = ymin; i <= ymax; i++) {
            System.out.print("-+-");
        }
        System.out.println();
        for (int i =  ymin; i <= ymax; i++) {
            if (i == ymin) {
                System.out.print("    " + i);
            } else if (i > 9) {
                System.out.print(" " + i);
            } else {
                System.out.print("  " + i);
            }
        }
        in.close();
    }
}
