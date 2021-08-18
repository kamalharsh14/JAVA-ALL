package Assignments;

import java.util.*;

public class Assign5Q4 {
    private int year, month, date;

    void set(int y, int m, int d) {
        year = y;
        month = m;
        date = d;
    }

    void increment() {
        int dmax = 0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            dmax = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 12){
            dmax = 30;
        }
        else if(month == 2){
            if(year % 4 == 0){
                dmax = 29;
            }
            else{
                dmax = 28;
            }
        }
        if(date < dmax){
            date++;
        }
        else{
            date = 1;
            if(month != 12){
                month++;
            }
            else{
                month =1;
                year++;
            }
        }
    }

    void display() {
        System.out.print(date + " - " + month + " - " + year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter date:");
        int d = in.nextInt();
        System.out.print("Enter month:");
        int m = in.nextInt();
        System.out.print("Enter year:");
        int y = in.nextInt();
        Assign5Q4 ob = new Assign5Q4();
        if (m < 13 && d < 32 && d > 0 && m > 0 && y > 0) {
            ob.set(y, m, d);
            System.out.println("\nDate: ");
            ob.display();
            System.out.println("\nIncremented Date:");
            ob.increment();
            ob.display();
            System.out.println("\nIncremented Date:");
            ob.increment();
            ob.display();
            System.out.println("\nIncremented Date:");
            ob.increment();
            ob.display();
            System.out.println("\nIncremented Date:");
            ob.increment();
            ob.display();
            System.out.println();
        } else {
            System.out.println("INVALID Date!");
        }
        in.close();
    }
}