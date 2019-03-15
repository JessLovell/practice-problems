package oceans;

public class Oceans {
    /*
    * given an ocean, count the the number of islands
    */

    private int isIsland (char[][] ocean) {

        int islandCount = 0;
        boolean[][] visited = new boolean[ocean.length][ocean[0].length];

        for (int i = 0;  i < ocean.length; i++){
            for (int j = 0; j < ocean[i].length; j++){

                // Queue

                if (ocean[i][j] == 'x' && !visited[i][j]){


                }
                visited[i][j] = true;
            }
        }
        return islandCount;
    }
}
