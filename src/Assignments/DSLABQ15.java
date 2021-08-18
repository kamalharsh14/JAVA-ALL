package Assignments;
import java.util.*;
public class DSLABQ15 {
    int top;
    int max;
    int stack[];
    int rev[];
    DSLABQ15(int n){
        top = -1;
        max = n;
        stack = new int[max];
        rev = new int[max];
    }
    void push(int element){
        if(top == max){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = element;
        }
    }
    int pop(){
        int del = 0;
        if(top == -1){
            System.out.println("Stack Empty");
        }
        else{
            del = stack[top--];
        }
        return  del;
    }
    void rev(int n){

    }
    void display(){
        if(top == -1){
            System.out.println("Stack Empty");
        }
        for(int i = top ; i > -1; i--){
            System.out.println(" --- --- ");
            System.out.println("|   "+stack[i]+"   | <----- TOP = "+i);
            System.out.println(" ---|--- ");
            System.out.println("    v ");
        }
        System.out.println(" --- --- ");
        System.out.println("|  Null  | <----- TOP = -1");
        System.out.println(" ------- ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the max size of stack");
        int n = in.nextInt();
        DSLABQ15 ob = new DSLABQ15(n);
        System.out.println("\nEnter the elements of stack");
        for(int i = 0 ; i < n ; i++){
            int el = in.nextInt();
            ob.push(el);
        }
        System.out.println("\nStack:\n");
        ob.display();
        for(int i = 0 ; i < n ; i++){
            ob.pop();
        }
        in.close();
    }
    
}
