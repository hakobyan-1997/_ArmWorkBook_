package collections.list.linkedlist.book_tasks;

import java.util.LinkedList;

public class Task_6 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        // Add an element at the beginning
        l_list.addFirst("White");

        // Add an element at the end of list
        l_list.addLast("Pink");
        System.out.println("Final linked list:" + l_list);
    }
}
