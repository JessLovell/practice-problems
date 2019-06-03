import java.util.Arrays;

public class ArrayReverse{
    public static void main(String[] args){
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayReverse(input)));
    }

    public static int[] arrayReverse (int[] input){
        int[] output = new int[input.length];
        for(int i = (input.length - 1); i >= 0; i--){
            output[i] = input[(input.length - 1) - i];
        }
        return output;
    }
}
