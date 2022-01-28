import java.util.Arrays;

public class Queue {
    int front;
    int rear;
    int data[];
    int INITIAL_CAPACITY = 10;

    public Queue(int N) {
        data = new int[N];
        front = -1;
        rear = -1;
    }

    public Queue() {
        data = new int[INITIAL_CAPACITY];
        front = -1;
        rear = -1;
    }

    public void enqueue(int val) {
        if (isFull())
            return;
        data[++rear] = val;
    }

    public int dequeue() {
        if (isEmpty())
            return -1;
        front++;
        return data[front];
    }

    public int front() {
        if (isEmpty())
            return -1;
        return data[front + 1];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return rear == data.length - 1;
    }

    @Override
    public String toString() {
        return "Queue [INITIAL_CAPACITY=" + INITIAL_CAPACITY + ", data=" + Arrays.toString(data) + ", front=" + front
                + ", rear=" + rear + "]";
    }
    
}
