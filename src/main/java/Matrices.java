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

//        /*
//        j - start row
//        k - end row
//        l - start col
//        m - end col
//        i - iterator
//         */
//
        int i, j = 0, l = 0;
        int k = arr.length;
        int m = arr[0].length;

        while (j < k && l < m){

            // print each row starting at j
            for (i = l; i < m; ++i){
                System.out.print(arr[j][i] + " ");
            }
            j++;

            //print the column at each
            for (i = j; i < k; ++i){
                System.out.print(arr[i][m - 1] + " ");
            }
            m--;

            //print the last row
            if (j < k){
                for (i = m - 1; i >= l; --i){
                    System.out.print(arr[k - 1][i] + " ");
                }
                k--;
            }

            // print the first col
            if (l < m){
                for(i = l; i >= l; --i){
                    System.out.print(arr[l][i] + " ");
                }
                l++;
            }
        }

//        int i, k = 0, l = 0;
//
//        int m = a.length;
//        int n = a[0].length;
//        /*  k - starting row index
//        m - ending row index
//        l - starting column index
//        n - ending column index
//        i - iterator
//        */
//
//        while (k < m && l < n) {
//            // Print the first row from the remaining rows
//            for (i = l; i < n; ++i) {
//                System.out.print(a[k][i] + " ");
//            }
//            k++;
//
//            // Print the last column from the remaining columns
//            for (i = k; i < m; ++i) {
//                System.out.print(a[i][n - 1] + " ");
//            }
//            n--;
//
//            // Print the last row from the remaining rows */
//            if (k < m) {
//                for (i = n - 1; i >= l; --i) {
//                    System.out.print(a[m - 1][i] + " ");
//                }
//                m--;
//            }
//
//            // Print the first column from the remaining columns */
//            if (l < n) {
//                for (i = m - 1; i >= k; --i) {
//                    System.out.print(a[i][l] + " ");
//                }
//                l++;
//            }
//        }
    }

    //--------------HELPER METHODS---------------------

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
