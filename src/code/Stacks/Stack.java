public class Stack{

    int MAX_SIZE = 10;
    Integer arr[];
    int top;
    
    public Stack() {
        // top = -1, no elements in stack
        top = -1;
        arr = new Integer[MAX_SIZE];
    }

    // O(1)
    void push(int val) {
        // CHecking overflow
        if(isFull()) return;

        top++;
        arr[top] = val;
    }

    // O(1)
    Integer pop() {
        // Checking underflow
        if(isEmpty()) return -1;

        // int temp = arr[top];
        // arr[top] = 0;
        // top--;
        System.out.println(arr[top]);
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    void display() {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------");
    }
}