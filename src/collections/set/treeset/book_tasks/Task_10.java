package collections.set.treeset.book_tasks;

import java.util.TreeSet;

public class Task_10 {
    public static void main(String[] args) {
        // creating TreeSet
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet <Integer> treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));

    }
}
