package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAdd() {

        LinkedList<Integer> one = new LinkedList<Integer>();
        assertEquals(null, one.head);
        assertEquals(0, one.size);

        one.add(12);
        assertEquals(1, one.size);

        one.add(4);
        one.add(15);
        one.add(21);
        Node<Integer> expected = one.add(32);
        assertEquals(expected, one.head);
    }

    @Test
    public void testFindMiddle() {

        // Test List of odd size
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(12);
        one.add(4);
        Node<Integer> expected = one.add(15);
        one.add(21);
        one.add(32);

        assertEquals(expected, one.findMiddle());

        // Test List of even size
        LinkedList<String> two = new LinkedList<String>();
        two.add("This is a test");
        Node<String> expectedTwo = two.add("four");
        two.add("fifteen");
        two.add("twenty-one");
        assertEquals(expectedTwo, two.findMiddle());
    }

    @Test
    public void testReverse(){
        LinkedList<Integer> one = new LinkedList<Integer>();
        Node<Integer> expected = one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);
        one.toString();
        one.reverse();
        one.toString();
        assertEquals(expected, one.head);
    }

    @Test
    public void testLength(){
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);
        assertEquals(5, one.length());
        one.add(6);
        one.add(7);
        one.add(8);
        assertEquals(8, one.length());
    }

    @Test
    public void testFind(){
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(1);
        Node<Integer> expected1 =  one.add(2);
        one.add(3);
        one.add(4);
        Node<Integer> expected2 =  one.add(5);
        Node<Integer> expected3 =  one.add(6);
        one.add(7);
        one.add(8);

        assertEquals(expected3, one.find(4));
        assertEquals(expected2, one.find(3));
        assertEquals(expected1, one.find(6));
    }

    @Test
    public void testRemoveDupes(){
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(8);
        one.add(4);
        one.add(5);
        one.add(8);
        one.add(8);
        one.add(8);
        one.add(8);

        one.toString();
        one.removeDuplicate();
        one.toString();
        assertEquals(6, one.length());
    }

    @Test
    public void testIsCycle(){
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(8);
        one.add(4);
        one.add(5);
        assertFalse("This is not a cycle", one.isCycle());

        one = new LinkedList<Integer>();
        one.add(1).setNext(one.add(3));
        one.add(2);

        assertTrue("This LL is a cycle", one.isCycle());

    }
}