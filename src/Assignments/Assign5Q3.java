package Assignments;

import java.util.*;

public class Assign5Q3 {
    private int hours, minutes, seconds;

    void set(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void increment() {
        if (seconds == 59) {
            seconds = 0;
            if (minutes == 59) {
                minutes = 0;
            } else {
                minutes++;
            }
            if (hours == 23) {
                hours = 0;
            } else {
                hours = hours + 1;
            }
        } else {
            seconds++;
        }
    }

    void display() {
        System.out.print(hours + " : " + minutes + " : " + seconds);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter hours:");
        int h = in.nextInt();
        System.out.print("Enter minutes:");
        int m = in.nextInt();
        System.out.print("Enter seconds:");
        int s = in.nextInt();
        Assign5Q3 ob = new Assign5Q3();
        if (h < 24 && m < 60 && s < 60) {
            ob.set(h, m, s);
            System.out.println("\nTime: ");
            ob.display();
            System.out.println("\nIncremented Time:");
            ob.increment();
            ob.display();
            System.out.println("\nIncremented Time:");
            ob.increment();
            ob.display();
            System.out.println("\nIncremented Time:");
            ob.increment();
            ob.display();
            System.out.println("\nIncremented Time:");
            ob.increment();
            ob.display();
            System.out.println();
        }
        else{
            System.out.println("INVALID TIME!");
        }
        in.close();
    }
}
