package Codechef;

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double bb = in.nextDouble();
        if (x > 0 && x <= 2000) {
            if (bb > 0 && bb <= 2000) {
                if (x <= bb) {
                    if (x % 5 == 0) {
                        if ((x + 0.50) <= bb) {
                            bb = bb - x - 0.50;
                        }
                    }
                }
            }
        }
        System.out.printf("%.2f", bb);
        in.close();
    }
}
