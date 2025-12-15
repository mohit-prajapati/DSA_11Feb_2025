package LinkedList;

import java.util.LinkedList;

public class LinkedListInCollections {
    public static void main(String[] args) {
        // create linked list
        LinkedList<Integer> list = new LinkedList<>();

        // add elements
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(5);

        // print linked list
        System.out.println(list);

        // remove element
        // list.remove(2);
        // System.out.println(list);
    }
}
