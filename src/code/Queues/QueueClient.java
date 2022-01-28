public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(1000);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
