package Codechef;

import java.util.*;

public class CORTSENT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            boolean first = false, second = false, ans = true;
            for (int j = 0; j < n; j++) {
                String s = in.next();
                if (ans == true) {
                    second = first = false;
                    for (int k = 0; k < s.length(); k++) {
                        if (s.charAt(k) >= 'a' && s.charAt(k) <= 'm') {
                            first = true;
                        } else if (s.charAt(k) >= 'N' && s.charAt(k) <= 'Z') {
                            second = true;
                        } else {
                            ans = false;
                        }
                    }
                    if (first == true && second == true) {
                        ans = false;
                    }
                }
            }
            if (ans == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
