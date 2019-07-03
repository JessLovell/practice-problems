import java.util.ArrayList;
import java.util.HashSet;

public class Jarray {

    //How do you find the missing number in a given integer array of 1 to 100?
    public static int missingNumber(int[] arr){

        HashSet<Integer> numbers = new HashSet<>();
        for(int a : arr){
            numbers.add(a);
        }
        for(int i = 1; i <= 100; i++){
            if (!numbers.contains(i)){
                return i;
            }
        }
        return -1;
    }

   // How do you find the duplicate number on a given integer array?
    public static String duplicate(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if (set.contains(arr[i])){
                return "Duplicate value: " + arr[i];
            }
            set.add(arr[i]);
        }
        return "No Duplicates";
    }

    // How do you find the largest and smallest number in an unsorted integer array?
    public static int[] findExtremes(int[] arr){

        if(arr.length == 0){
            return arr;
        }

        int[] ans = new int[]{arr[0], arr[0]};

        for (int i = 0; i < arr.length; i++){
           if(arr[i] > ans[1]){
               ans[1] = arr[i];
           }
           if(arr[i] < ans[0]){
               ans[0] = arr[i];
           }
        }
        return ans;
    }

    // How do you find all pairs of an integer array whose sum is equal to a given number? O(n)^2

    public static int[][] sumPairs(int[] arr, int num){

        ArrayList<int[]> pairs = new ArrayList<>();
        if (arr.length == 0) {
            return listToMatrix(pairs);
        }

        HashSet<Integer> visited = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (!visited.contains(arr[j]) && !visited.contains(arr[i]) && arr[i] + arr[j] == num){
                    pairs.add(new int[]{arr[i], arr[j]});
                    visited.add(arr[i]);
                    visited.add(arr[j]);
                }
            }
        }

        return listToMatrix(pairs);
    }

    // How do you find all pairs of an integer array whose sum is equal to a given number? O(n)
    public static int[][] sumPairsN(int[] arr, int num) {

        //check empty
        ArrayList<int[]> pairs = new ArrayList<>();
        if (arr.length == 0) {
            return listToMatrix(pairs);
        }

        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> paired = new HashSet<>();

        int diff;
        for (int a : arr){
            diff = num - a;
            if (visited.contains(diff) && !paired.contains(a)){
                pairs.add(new int[]{a, diff});
                paired.add(a);
                paired.add(diff);
            }
            visited.add(a);
        }

        return listToMatrix(pairs);
    }

    // How do you find duplicate numbers in an array if it contains multiple duplicates?
    public static int[] allDuplicates(int[] arr){
        HashSet<Integer> visited = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int a: arr){
            if(visited.contains(a) && !duplicates.contains(a)){
                duplicates.add(a);
            }
            visited.add(a);
        }

        return listToArray(duplicates);
    }

    // How are duplicates removed from a given array in Java?
    public static int[] removeDuplicates(int[] arr){

        if(arr.length <= 1){
            return arr;
        }

        ArrayList<Integer> noDupes = new ArrayList<>();
        for(int a : arr){
            if(!noDupes.contains(a)){
                noDupes.add(a);
            }
        }

        return listToArray(noDupes);
    }

    // How do you reverse an array in place in Java?
    public static int[] reverse(int[] arr){

        if(arr.length == 0){
            return arr;
        }

        int temp;
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    

    // HELPER FUNCTIONS ---------------------------------------------------

    protected static int[] listToArray(ArrayList<Integer> list){
        int[] pure = new int[list.size()];
        int iterator = 0;
        for (Integer a: list){
            pure[iterator] = a;
            iterator++;
        }

        return pure;
    }
    protected static int[][] listToMatrix(ArrayList<int[]> list){
        int[][] pure = new int[list.size()][2];
        int iterator = 0;
        for (int[] a: list){
            pure[iterator] = a;
            iterator++;
        }

        return pure;
    }

}
