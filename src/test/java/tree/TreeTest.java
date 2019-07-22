package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testPrintTree() {

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(4));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(6));
        Tree<Integer> tree = new Tree<>(one);

        /*
                1
            2       3
         4  5       6   -

         */

        tree.preorderTree();
        System.out.println();
        tree.inOrderTree();
    }


}