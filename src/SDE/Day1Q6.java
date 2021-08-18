package SDE;

import java.util.*;

public class Day1Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int slow = a[0];
        int fast = a[0];
        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while (slow != fast);
        fast = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }
        System.out.println(slow);
        in.close();
    }
}
