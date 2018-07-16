import java.util.Arrays;

public class TasksArrays {

    void fill(int[] array, int filler){
        for (int i = 0; i < array.length ; i++) {
            array[i] = filler;
        }
        System.out.println(Arrays.toString(array));
    }

    int sum(int[] array){
        int sumArray = 0;
        for (int i = 0; i < array.length ; i++) {
            sumArray += array[i];
        }
        System.out.println("sum: " + sumArray);
        return sumArray;
    }
}
