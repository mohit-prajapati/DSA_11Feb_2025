package LinkedList;

public class ZigZagLinkedList {

    // Node class
    public static class Node {
        int data; // data
        Node next; // address

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst function | add element at the start of the list
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        // check if the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = newNode next = head
        newNode.next = head;

        // step 3 = head = newNode
        head = newNode;
    }

    // printList function | print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // find mid
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid node
    }

    public void zigZag() {
        // find mid
        Node mid = findMid(head);

        // 2th half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternet mergeing
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        ZigZagLinkedList list = new ZigZagLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);

        list.printList(); // 1->2->3->4->5->6->null
        list.zigZag();
        list.printList(); // 1->6->2->5->3->4->null
    }

}
