package SDE;

import java.util.*;

public class Day1Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int mid = 0;
        int low = 0;
        int high = n - 1;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        while (mid <= high) {
            int ch = a[mid];
            switch (ch) {
                case 0:
                    a[mid] = a[low];
                    a[low] = ch;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    a[mid] = a[high];
                    a[high] = ch;
                    high--;
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "");
        }
        in.close();
    }
}
