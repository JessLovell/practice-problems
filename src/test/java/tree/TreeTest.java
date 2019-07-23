package tree;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testPrintTree() {
        /*
                1
            2       3
         4  5       6   -

         */

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(4));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(6));
        Tree<Integer> tree = new Tree<>(one);


        tree.preorderTree();
        System.out.println();
        tree.inOrderTree();
        System.out.println();
        tree.postOrderTree();
    }

    @Test
    public void testIsBST(){
        Node<Integer> one = new Node<>(6);
        Node<Integer> two = new Node<>(4);
        Node<Integer> three = new Node<>(8);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(3));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(0));
        Tree<Integer> tree = new Tree<>(one);

        assertFalse(tree.isBST(one));
        assertTrue(tree.isBST(two));
        assertTrue(tree.isBST(three));
    }

    @Test
    public void testFindMin(){
        Node<Integer> one = new Node<>(6);
        Node<Integer> two = new Node<>(4);
        Node<Integer> three = new Node<>(8);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(3));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(0));
        Tree<Integer> tree = new Tree<>(one);

        assertEquals(0, tree.findMin(one));
        assertEquals(3, tree.findMin(two));
        assertEquals(0, tree.findMin(three));
    }

    @Test
    public void testFindMax(){
        Node<Integer> one = new Node<>(6);
        Node<Integer> two = new Node<>(4);
        Node<Integer> three = new Node<>(8);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(3));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(0));
        Tree<Integer> tree = new Tree<>(one);

        assertEquals(8, tree.findMax(one));
        assertEquals(5, tree.findMax(two));
        assertEquals(8, tree.findMax(three));

    }


    @Test
    public void testCountLeaves(){
        Node<Integer> one = new Node<>(6);
        Node<Integer> two = new Node<>(4);
        Node<Integer> three = new Node<>(8);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(3));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(0));
        Tree<Integer> tree = new Tree<>(one);

        assertEquals(3, tree.countLeaves(one));
        assertEquals(2, tree.countLeaves(two));
        assertEquals(1, tree.countLeaves(three));
    }

    @Test
    public void testPrintLeaves(){
        Node<Integer> one = new Node<>(6);
        Node<Integer> two = new Node<>(4);
        Node<Integer> three = new Node<>(8);

        one.setLeft(two);
        one.setRight(three);

        two.setLeft(new Node<>(3));
        two.setRight(new Node<>(5));

        three.setLeft(new Node<>(0));
        Tree<Integer> tree = new Tree<>(one);

        tree.printLeaves(one);
        System.out.println();
        tree.printLeaves(two);
        System.out.println();
        tree.printLeaves(three);
    }
}