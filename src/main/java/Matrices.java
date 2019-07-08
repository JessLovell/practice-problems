import java.util.Arrays;

public class Matrices {

    // Gradietize an image (Sort a matrix). Uses RGB codes: 0-255
    public static int[][] gradient(int[][] matrix){

        int[] arr = toArray(matrix);

        // sort
        Arrays.sort(arr);

        // put into matrix
        return toMatrix(arr, matrix[0].length);
    }


    // Spiral print an array
    public static void spiralPrint(int[][] arr){

        /*
        sr - start row
        er - end row
        sc - start col
        ec - end col
         */

        int i, sr = 0, sc = 0;
        int er = arr.length;
        int ec = arr[0].length;

        while (sr < er && sc < ec){

            // print top row
            // Start at the start col, end at the end col. Start row does not change, end column will
            for (i = sc; i < ec; i++){
                System.out.print(arr[sr][i] + " ");
            }
            sr++;

            // print last col
            // start at the start row, go to end row, end column does not change, end row will
            for (i = sr; i < er; i++){
                System.out.print(arr[i][ec - 1] + " ");
            }
            ec--;

            // print last row
            // end col to start col, print end row and, end col changes
            if (sr < er){
                for (i = ec - 1; i >= sc; i--){
                    System.out.print(arr[er - 1][i] + " ");
                }
                er--;
            }

            // print first col
            // end row to start row, end row changes, start col does not.
            if (sc < ec){
                for (i = er - 1; i >= sr; i--) {
                    System.out.print(arr[i][sc] + " ");
                }
                sc++;
            }
        }
    }

    //print multiplication table for 12X12
    public static void multiTable(int width){

        for (int i = 1; i <= width; i++){
            for (int j = 1; j <= width; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }

    // Given an `Ocean`, count the number of `Islands`.
    public static int countIslands(int[][] ocean){

        //check if array is not empty
        int sum = 0;

        boolean[][] visited = new boolean[ocean.length][ocean[0].length];

        for (int i = 0; i < ocean.length; i++){
            for (int j = 0; j < ocean[i].length; j++){
                if (ocean[i][j] == 1 && !visited[i][j]){
                    sum++;
                    removeIsland(ocean, i, j);
                }
            }
        }

        return sum;
    }

    //--------------HELPER METHODS---------------------

    protected static void removeIsland(int[][] ocean, int i, int j){

        //out of bounds
        if (i > ocean.length - 1 || i < 0 ||
                j > ocean[i].length - 1 || j < 0 || ocean[i][j] == 0){
            return;
        }

        ocean[i][j] = 0;

        removeIsland(ocean, i + 1, j);
        removeIsland(ocean, i - 1, j);
        removeIsland(ocean, i, j + 1);
        removeIsland(ocean, i, j - 1);
        removeIsland(ocean, i + 1, j + 1);
        removeIsland(ocean, i - 1, j + 1);
        removeIsland(ocean, i - 1, j - 1);
        removeIsland(ocean, i + 1, j - 1);
    }


    protected static int[] toArray(int[][] matrix){

        int[] arr = new int[(matrix.length) * (matrix[0].length)];

        int index = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                arr[index] = matrix[i][j];
                index++;
            }
        }
        return arr;
    }

    protected static int[][] toMatrix(int[] arr, int width){

        int[][] matrix = new int[arr.length/width][width];
        int index = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = arr[index];
                index++;
            }
        }
        return matrix;
    }

}
