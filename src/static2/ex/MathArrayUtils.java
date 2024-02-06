package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {
    public static int sum(int[] array){
        return Arrays.stream(array).sum();
    }

    public static double average(int[] array){
        return Arrays.stream(array).sum() / array.length;
    }

    public static int min(int[] array){
        int min = 100;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}
