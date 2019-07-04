package LinkedList;

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
}