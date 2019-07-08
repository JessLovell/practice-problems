import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MatricesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

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
        assertEquals("1 2 3 6 9 12 11 10 7 4 5 8 ", outContent.toString());

    }

    @Test
    public void testMultiTable(){

        Matrices.multiTable(12);
        assertEquals("1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t\n" +
                "2\t4\t6\t8\t10\t12\t14\t16\t18\t20\t22\t24\t\n" +
                "3\t6\t9\t12\t15\t18\t21\t24\t27\t30\t33\t36\t\n" +
                "4\t8\t12\t16\t20\t24\t28\t32\t36\t40\t44\t48\t\n" +
                "5\t10\t15\t20\t25\t30\t35\t40\t45\t50\t55\t60\t\n" +
                "6\t12\t18\t24\t30\t36\t42\t48\t54\t60\t66\t72\t\n" +
                "7\t14\t21\t28\t35\t42\t49\t56\t63\t70\t77\t84\t\n" +
                "8\t16\t24\t32\t40\t48\t56\t64\t72\t80\t88\t96\t\n" +
                "9\t18\t27\t36\t45\t54\t63\t72\t81\t90\t99\t108\t\n" +
                "10\t20\t30\t40\t50\t60\t70\t80\t90\t100\t110\t120\t\n" +
                "11\t22\t33\t44\t55\t66\t77\t88\t99\t110\t121\t132\t\n" +
                "12\t24\t36\t48\t60\t72\t84\t96\t108\t120\t132\t144\t\n", outContent.toString());

    }

    @Test
    public void testOceans(){


        int[][] one = new int[][]{  {1,0,0,0},
                                    {1,0,0,0},
                                    {1,0,0,0},
                                    {1,0,0,0}};

        int[][] two = new int[][]{  {0,1,1,0},
                                    {0,1,0,0},
                                    {1,0,0,0},
                                    {0,1,0,0}};

        int[][] three = new int[][]{{1,1,1,1},
                                    {1,1,1,1},
                                    {1,1,1,1},
                                    {1,1,1,1}};

        int[][] four = new int[][]{{1,0,1,1},
                                    {0,0,0,1},
                                    {1,0,0,1},
                                    {0,0,1,1}};


        assertEquals(1, Matrices.countIslands(one));
        assertEquals(1, Matrices.countIslands(two));
        assertEquals(1, Matrices.countIslands(three));
        assertEquals(3, Matrices.countIslands(four));


    }
}