import java.util.Arrays;

public class TasksArrays {
    //Task 1* (ArrayFiller)
    void fill(int[] array, int filler){
        for (int i = 0; i < array.length ; i++) {
            array[i] = filler;
        }
        System.out.println(Arrays.toString(array));
    }
    //Task 2* (ArraySumCalculator)
    int sum(int[] array){
        int sumArray = 0;
        for (int i = 0; i < array.length ; i++) {
            sumArray += array[i];
        }
        System.out.println("sum: " + sumArray);
        return sumArray;
    }
    //Task 3* (ArrayPositiveFinder)
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
    //Task 4* (ArrayPositivesCounter)
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
        return lastElement;
    }
    //Task 5* (SequenceArrayCreator)
    int countPositives(int[] array){
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    //Task 6* (MatrixPrinter)
    void printMatrix(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    //Task 7* (MatrixAverageCalculator)
    double calculateAverage(int[][] matrix){
        int sum = 0;
        int amountNumbers = 0;
        double count;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                sum += matrix[i][j];
            }
            amountNumbers += matrix[i].length;
        }
        count = sum/amountNumbers;
        System.out.println("calculateAverage: " + count);
        return count;
    }
    //Task 8* (MatrixMaxSumRowFinder)
//    int findMaxSumRow(int[][] matrix){
//        int index = -1;
//        int sum;
//        for (int i = 0; i <matrix.length ; i++) {
//
//        }
//        return index;
//    }

}
