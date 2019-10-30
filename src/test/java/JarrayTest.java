import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class JarrayTest {

    @Test
    public void duplicate() {
    }

    @Test
    public void testFindExtremes() {

        int[] one = new int[]{1,2,3,4,5,30,40,50,20,-1};
        int[] two = new int[]{13};
        int[] three = new int[30];
        int[] four = new int[]{14,2, 17, 182, 127};

        assertArrayEquals(new int[]{-1, 50}, Jarray.findExtremes(one));
        assertArrayEquals(new int[]{13, 13}, Jarray.findExtremes(two));
        assertArrayEquals(new int[]{0, 0}, Jarray.findExtremes(three));
        assertArrayEquals(new int[]{2, 182}, Jarray.findExtremes(four));
    }

    @Test
    public void testSumPairs(){

        int[] one = new int[]{1,3,1};
        int[] two = new int[]{1,1,1,1,1};
        int[] three = new int[]{1,2,2,3,2,0,4};

        assertArrayEquals(new int[][]{{1, 1}}, Jarray.sumPairs(one,2));
        assertArrayEquals(new int[][]{{1, 1}}, Jarray.sumPairs(two,2));
        assertArrayEquals(new int[][]{{1, 3}, {2, 2},{0, 4}}, Jarray.sumPairs(three,4));
    }

    @Test
    public void testSumPairsN(){

        int[] one = new int[]{1,3,1};
        int[] two = new int[]{1,1,1,1,1};
        int[] three = new int[]{1,2,2,3,2,0,4};

        assertArrayEquals(new int[][]{{1, 1}}, Jarray.sumPairsN(one,2));
        assertArrayEquals(new int[][]{{1, 1}}, Jarray.sumPairsN(two,2));
        assertArrayEquals(new int[][]{{2, 2}, {3, 1},{4, 0}}, Jarray.sumPairsN(three,4));
    }

    @Test
    public void testAllDuplicates(){
        int[] one = new int[]{1,3,1};
        int[] two = new int[]{1,1,1,1,1};
        int[] three = new int[]{1,2,2,3,2,0,4};
        int[] four = new int[]{34,35,23,56,23,78,34,78,12,5,23,7,78,7,9,100};

        assertArrayEquals(new int[]{1}, Jarray.allDuplicates(one));
        assertArrayEquals(new int[]{1}, Jarray.allDuplicates(two));
        assertArrayEquals(new int[]{2}, Jarray.allDuplicates(three));
        assertArrayEquals(new int[]{23, 34, 78, 7}, Jarray.allDuplicates(four));
    }

    @Test
    public void testRemoveDuplicates(){
        int[] one = new int[]{1,3,1};
        int[] two = new int[]{1,1,1,1,1};
        int[] three = new int[]{1,2,2,3,2,0,4};
        int[] four = new int[]{34,35,23,56,23,78,34,78,12,5,23,7,78,7,9,100};

        assertArrayEquals(new int[]{1, 3}, Jarray.removeDuplicates(one));
        assertArrayEquals(new int[]{1}, Jarray.removeDuplicates(two));
        assertArrayEquals(new int[]{1, 2, 3, 0, 4}, Jarray.removeDuplicates(three));
        assertArrayEquals(new int[]{34, 35, 23, 56, 78, 12, 5, 7, 9, 100}, Jarray.removeDuplicates(four));
    }

    @Test public void testReverse(){
        int[] one = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] two = new int[]{3};
        int[] three = new int[]{4,5,7,6,8};

        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, Jarray.reverse(one));
        assertArrayEquals(new int[]{3}, Jarray.reverse(two));
        assertArrayEquals(new int[]{8, 6, 7, 5, 4}, Jarray.reverse(three));
    }

    @Test
    public void testNFactorial(){
        System.out.println(Jarray.nFactorial(2));
        System.out.println(Jarray.nFactorial(3));
        System.out.println(Jarray.nFactorial(4));
    }
}