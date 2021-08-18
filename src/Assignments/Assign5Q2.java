package Assignments;
import java.util.*;
public class Assign5Q2 {
    int top;
    int max;
    char stack[];
    char rev[];
    String string="";
    Assign5Q2(int n){
        top = -1;
        max = n;
        stack = new char[max];
    }
    void push(char element){
        if(top == max){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = element;
        }
    }
    char pop(){
        char del = 0;
        if(top == -1){
            System.out.println("Stack Empty");
        }
        else{
            del = stack[top--];
        }
        return del;
    }
    String rev(char st){
        string = string + st;
        return string;

    }
    void display(){
        for(int i = top ; i > -1; i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the String");
        String str = in.nextLine();
        String s = "";
        int n = str.length();
        Assign5Q2 ob = new Assign5Q2(n);
        for(int i = 0 ; i < n ; i++){
            char ch = str.charAt(i);
            ob.push(ch);
        }
        for(int i = 0 ; i < n ; i++){
            s =ob.rev(ob.pop());
        }
        System.out.println("\nThe Reveresed String: '"+s+"'");
        in.close();
    }
}
