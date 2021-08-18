package Assignments;

class code3 {
    final int max = 10;
    int top;
    int t;int to;
    int stack[];
    int copy[];
    int copyqueue[];
    int queue[];
    int f; int r;

    code3() {
        top = -1;
        t = -1;
        to = -1;
        stack = new int[max];
        copy = new int[max];
        copyqueue = new int[max];
        queue = new int[max];
        f = 0 ; r = 0;
    }

    int empty() {
        if (top <= -1) {
            return 1;
        } else {
            return 0;
        }
    }

    int full() {
        if (top >= max) {
            return 1;
        } else {
            return 0;
        }
    }

    void push(int n) {
        if (top < max) {
            stack[++top] = n;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop() {
        int d = 0;
        if (top > 0) {
            d = stack[top--];
        } else {
            System.out.println("Stack Overflow");
        }
        return d;
    }

    void copy() {
        for (int i = top; i > -1; i--) {
            copy[++t] = stack[top--];
        }
    }

    void display() {
        if (empty() != 1) {
            System.out.println("Stack is being displayed");
            System.out.println("---------");
            for (int i = top; i > -1; i--) {
                System.out.println("|   " + stack[i] + "   |");
                System.out.println("---------");
            }
        }
    }

    void displaycopied() {
        System.out.println("Stack is being displayed");
        System.out.println("---------");
        for (int i = t; i > -1; i--) {
            System.out.println("|   " + copy[i] + "   |");
            System.out.println("---------");
        }
    }
    
    void queue(int n){
        if(max == r){
            System.out.println("Queue full\n");
        }
        else{
            queue[r++] = n;
        }
    }
    void displayqueue() {
        if (r != f) {
            System.out.println("\n\nQueue is being displayed");
            System.out.print("|");
            for(int i = f; i <= r; i++){
                System.out.print("   "+queue[i]+"   |");
            }
        }
        else{
            System.out.println("Queue is empty");
        }
    }
    void copyqueue() {
        f = 0;
        if(f<=r){
        for (int i = f; i <= r; i++) {
            copyqueue[++to] = queue[i];
        }}
    }
    void displaycopyqueue() {
        System.out.println("Stack is being displayed");
        System.out.println("---------");
        for (int i = to; i > -1; i--) {
            System.out.println("|   " + copyqueue[i] + "   |");
            System.out.println("---------");
        }
    }
    

    public static void main(String args[]) {
        code3 ob = new code3();
        ob.push(2);
        ob.push(4);
        ob.push(6);
        ob.push(8);
        ob.push(5);
        ob.push(7);
        ob.push(3);
        ob.push(9);
        ob.display();
        ob.copy();
        ob.display();
        System.out.println("\n\nCopying elements from Stack to Stack -->");
        ob.displaycopied();
        ob.queue(2);
        ob.queue(8);
        ob.queue(9);
        ob.queue(5);
        ob.queue(4);
        ob.queue(3);
        ob.queue(7);
        ob.queue(1);
        ob.displayqueue();
        System.out.println("\n\nCopying elements from Queue to Stack -->");
        ob.copyqueue();
        ob.displaycopyqueue();
    }
}