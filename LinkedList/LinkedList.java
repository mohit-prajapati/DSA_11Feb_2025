package LinkedList;

public class LinkedList {

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

    // addLast function | add element at the end of the list
    public void addLast(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        // check if the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = tail next = newNode
        tail.next = newNode;

        // step 3 = tail = newNode
        tail = newNode;
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

    // add function | add element at the given index
    public void add(int idx, int data) {
        // check if the idx is 0
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeFirst function | remove element from the start of the list
    public int removeFirst() {
        // spacel case to handle
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    // removeLast function | remove element from the end of the list
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // reach prev node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // itrSearch function | search element in the list
    public int itrSearch(int key) { // O(n)
        Node temp = head;
        int i = 0;
        while (i < size) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    // recursiveSearch function | search element in the list
    public int recursiveSearch(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = recursiveSearch(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    // reverseLinkedList function | reverse the list
    public void reverseLinkedList() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // deleteNthFromEnd function | delete element from the given index
    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // removing first
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // find mid node using with slow fast approch | find mid of the list
    public Node findMid(Node head) { // Helper function
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // + 1
            fast = fast.next.next; // + 2
        }

        return slow; // slow is my midNode
    }

    // isPalindrome function | check if the list is palindrome
    public boolean isPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node mid = findMid(head);

        // reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // check left half and right half
        Node left = head;
        Node right = prev; // right half head

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    // isloopCycle function | Detect loop in linked list
    public boolean isloopCycle() {
        // floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            // move slow by 1 and fast by 2
            slow = slow.next;
            fast = fast.next.next;

            // check if slow and fast are meeting then cycle is present in the linked list
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // removeCycle function | Remove loop/cycle in linked list
    public void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node store
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;

    }

    // getMid function | find mid node using with slow fast approch | find mid of
    // the list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid node
    }

    // Merge function | merge two sorted linked list
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // MergeSort function | merge sort linked list
    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left and right mergeSort
        Node right = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(right);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        /* MergeSort */
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.printList();
        list.head = list.mergeSort(list.head);
        list.printList();

        /* MergeSort End */

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(list.isloopCycle());
        // list.removeCycle();
        // System.out.println(list.isloopCycle());
        // list.addFirst(3);
        // list.addFirst(2);
        // list.addFirst(1);

        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(1);

        // list.add(0, 100);

        // int val = list.removeFirst();
        // list.printList();

        // System.out.println(list.isPalindrome());

        // list.reverseLinkedList();
        // list.deleteNthFromEnd(3);
        // list.printList();
        // System.out.println("Size of the list is: " + list.size);
        // System.out.println("Removed element is: " + val);

        // int val2 = list.removeLast();
        // System.out.println("Size of the list is: " + list.size);
        // System.out.println("Removed element is: " + val2);

        // int idx = list.itrSearch(5);
        // int idx = list.recursiveSearch(list.head, 100);
        // System.out.println("Index of the element is: " + idx);
    }
}
