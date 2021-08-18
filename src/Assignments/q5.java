package Assignments;

class circularqueue {
    int max;
    int queue[];
    int front, rear;

    circularqueue() {
        front = 1;
        rear = 0;
        max = 10;
        queue = new int[max];
    }

    void enqueue(int n) {
        if(front == 0 && rear == (max-1) || rear == (front -2)% max){
            System.out.println("Queue is Full");
        }
        else{
            if(front > 0 && rear == (max-1)){
                rear = 0;
                queue[rear] = n; 
            }
            else if(rear == 0 && front ==1){
                queue[++rear] = n;
            }
            else{
                queue[++rear] = n;
            }
        }
    }

    public int dequeue() {
        int del = 0;
        if (rear != front) {
            del = queue[front];
            queue[front] = 0;
            front++;
            if(front == rear ) {
            System.out.println("Queue is empty");
            }
        }
        return del;
    }

    void display() {
        if (front == -1) {
            System.out.print("Queue is Empty");
        }
        System.out.print("\nElements in the Circular Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(" " + queue[i] + " <---");
        }
    }

    public static void main(String[] args) {
        circularqueue ob = new circularqueue();
        for (int i = 1; i <= 6; i++) {
            int mul = 1;
            if (i % 2 == 0)
                mul = 2 * i;
            else
                mul = 3 * i;
            ob.enqueue(mul);
        }
        ob.display();
        System.out.println("\nRemoving element:" + ob.dequeue());
        System.out.println("\nRemoving element:" + ob.dequeue());
        ob.display();
        System.out.println();
    }
}