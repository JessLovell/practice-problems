package oceans;

public class Oceans {
    /*
    * given an ocean, count the the number of islands
    */

    public static int isIsland (int[][] ocean) {

        int islandCount = 0;
        if(ocean.length == 0){
            return islandCount;
        }

        boolean[][] visited = new boolean[ocean.length][ocean[0].length];

        for (int i = 0;  i < ocean.length; i++){
            for (int j = 0; j < ocean[i].length; j++){
                if (ocean[i][j] == 1 && !visited[i][j]){
                    islandCount++;
                    changeIsland(ocean, i, j);
                }
            }
        }
        return islandCount;
    }

    public static void changeIsland(int[][] visited, int i, int j){
        //if it is out of bounds or 0, then return
        if (i < 0 || i >= visited.length ||
                j < 0 || j >= visited[0].length || visited[i][j] == 0){
            return;
        }

        //change visited at i, j to true
        visited[i][j] = 0;

        //increment each i, j value.
        changeIsland(visited, i - 1, j);
        changeIsland(visited, i + 1, j);
        changeIsland(visited, i, j - 1);
        changeIsland(visited, i, j + 1);
    }
}