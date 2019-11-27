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
            2       6
         4  5       3   -

         */

        tree.preorderTree();
        System.out.println();
        tree.inOrderTree();
    }

    @Test
    public void testMin(){
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(6);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(4));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(3));
        Tree<Integer> tree = new Tree<>(one);

        /*
                1
            2       6
         4  5       3   -

         */

        assertEquals((int) tree.min(one), 1);
        assertEquals((int) tree.min(three), 3);
        assertEquals((int) tree.min(three.left), 3);
        assertEquals((int) tree.min(two), 2);
    }

    @Test
    public void testMax() {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(6);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(4));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(3));
        Tree<Integer> tree = new Tree<>(one);

        assertEquals((int) tree.max(one), 6);
        assertEquals((int) tree.max(three), 6);
        assertEquals((int) tree.max(three.left), 3);
        assertEquals((int) tree.max(two), 5);
        assertEquals((int) tree.max(two.left), 4);
    }

    @Test
    public void testIsBSTFalse() {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(6);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(4));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(3));
        Tree<Integer> tree = new Tree<>(one);

        assertFalse(tree.isBST(one));
    }

    @Test
    public void testIsBSTFalsee(){
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(4));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(6));
        Tree<Integer> tree = new Tree<>(one);

        assertFalse(tree.isBST(one));
    }

    @Test
    public void testIsBSTTrue(){
        Node<Integer> one = new Node<>(4);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(5);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(1));
        two.setRight(new Node<>(3));

        three.setRight(new Node<>(6));
        Tree<Integer> tree = new Tree<>(one);

        /*
                4
            2       5
         1  3         6

         */

        assertTrue(tree.isBST(one));
    }


}