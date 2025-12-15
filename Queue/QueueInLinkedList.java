package Queue;

public class QueueInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node front; // head
        static Node rear; // tail

        // isEmpty
        public static boolean isEmpty() {
            return front == null && rear == null;
        }

        // Add
        public static void add(int data) {
            Node newNode = new Node(data);

            if (front == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = front.data;

            // single element
            if (rear == front) {
                rear = front = null;
            } else {
                front = front.next;
            }

            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
