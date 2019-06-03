package oceans;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OceansTest {

    @Test
    public void testChangeVisited(){

        int[][] pacific = new int[][]{
            {1,0,0,1,0,0},
            {0,0,0,1,0,0},
            {0,1,0,0,1,1},
            {0,1,1,0,1,1}};

        int[][] atlantic = new int[][]{
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};

        int[][] redSea = new int[][]{
                {1,1,1,1,1,1},
                {01,01,01,01,1,1},
                {01,01,01,01,01,01},
                {01,01,01,01,01,01}};

        assertEquals(4, Oceans.isIsland(pacific));
        assertEquals(0, Oceans.isIsland(atlantic));
        assertEquals(1, Oceans.isIsland(redSea));
    }

    @Test
    public void testEmpty() {
        int[][] one = new int[][]{};
    }

}