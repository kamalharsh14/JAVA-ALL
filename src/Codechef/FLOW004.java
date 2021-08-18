package Codechef;

import java.util.*;

public class FLOW004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String nm = Integer.toString(n);
            char firstdigit = nm.charAt(0);
            char lastdigit = nm.charAt(nm.length() - 1);
            int sum = Character.getNumericValue(firstdigit) + Character.getNumericValue(lastdigit);
            System.out.println(sum);
        }
        in.close();
    }
}
