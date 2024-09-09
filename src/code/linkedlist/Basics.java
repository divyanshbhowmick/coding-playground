package code.linkedlist;

public class Basics {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node<Integer> head = convertArray2LL(arr);
//        System.out.println(head.next.next.data);
//        traverse(head);
    }

    public static Node<Integer> convertArray2LL(int[] arr) {
        if (arr.length == 0) return null;
        Node<Integer> head = new Node<>(arr[0]);
        Node<Integer> runner = head;

        for (int idx = 1; idx < arr.length; idx++) {
            Node<Integer> tmp = new Node<>(arr[idx]);
            runner.next = tmp;
            runner = tmp;
        }
        return head;
    }

    public static void traverse(Node head) {
        if(head == null) return;
        System.out.println("Elements of the LL are:");
        Node mover = head;

        while (mover != null) {
            System.out.println(mover.data);
            mover = mover.next;
        }
    }
}
