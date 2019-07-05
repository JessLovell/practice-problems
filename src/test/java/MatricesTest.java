import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatricesTest {

    @Test
    public void testGradient() {

        int[][] one = new int[][]{{12, 1, 4}, {3, 6, 8}, {2, 5, 10}, {7, 9, 11}};
        assertArrayEquals(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}}, Matrices.gradient(one));
    }

    @Test
    public void testToArray() {

        int[][] one = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        System.out.println(Arrays.toString(Matrices.toArray(one)));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12}, Matrices.toArray(one));

        int[][] two= new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(Matrices.toArray(two)));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, Matrices.toArray(two));

        int[][] three = new int[][]{{1,2,3}};
        System.out.println(Arrays.toString(Matrices.toArray(three)));
        assertArrayEquals(new int[]{1,2,3}, Matrices.toArray(three));
    }

    @Test
    public void testSpiralPrint(){

        int[][] one = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        Matrices.spiralPrint(one);

    }
}