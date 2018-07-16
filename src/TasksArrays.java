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

    int findFirstPositive(int[] array){
        int first;
    int firstElement = -1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > 0 ){
                first = array[i];
                for (int j = 0; j <array.length ; j++) {
                    if (array[j]>0 && array[j]<first){
                        first = array[j];
                        firstElement = j;
                    }else if (array[j] == first){
                        firstElement = j;
                    }
                }
            }
        }
        System.out.println("findFirstPositive: " + firstElement);
        return firstElement;
    }

    int findLastPositive(int[] array){
        int last;
        int lastElement = -1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>0){
                last = array[i];
                for (int j = 0; j <array.length ; j++) {
                    if (array[j]>0 && array[j]>last){
                        last = array[j];
                        lastElement = j;
                }
                }
            }
        }
        System.out.println("findLastPositive: " + lastElement);
        System.out.println();
        return lastElement;
    }

}
