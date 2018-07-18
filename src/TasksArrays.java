import java.util.Arrays;

public class TasksArrays {
    //Task 1* (ArrayFiller)
    void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
        System.out.println(Arrays.toString(array));
    }

    //Task 2* (ArraySumCalculator)
    int sum(int[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        System.out.println("sum: " + sumArray);
        return sumArray;
    }

    //Task 3* (ArrayPositiveFinder)
    int findFirstPositive(int[] array) {
        int first;
        int firstElement = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                first = array[i];
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > 0 && array[j] < first) {
                        first = array[j];
                        firstElement = j;
                    } else if (array[j] == first) {
                        firstElement = j;
                    }
                }
            }
        }
        System.out.println("findFirstPositive: " + firstElement);
        return firstElement;
    }

    //Task 4* (ArrayPositivesCounter)
    int findLastPositive(int[] array) {
        int last;
        int lastElement = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                last = array[i];
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > 0 && array[j] > last) {
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
    int countPositives(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    //Task 6* (MatrixPrinter)
    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    //Task 7* (MatrixAverageCalculator)
    double calculateAverage(int[][] matrix) {
        int sum = 0;
        int amountNumbers = 0;
        double count;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            amountNumbers += matrix[i].length;
        }
        count = sum / amountNumbers;
        System.out.println("calculateAverage: " + count);
        return count;
    }

    //Task 8* (MatrixMaxSumRowFinder)
    int findMaxSumRow(int[][] matrix) {
        int index = -1;
        int sum;
        int[] sumArr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sumArr[i] = sum;
        }
        int max = sumArr[0];
        for (int i = 0; i < sumArr.length; i++) {
            if (sumArr[i] > max) {
                max = sumArr[i];
                index = i;
            }
        }

        System.out.println("findMaxSumRow: " + index);
        return index;
    }

    //Task 9* (MatrixTransposer)
    int[][] transpose(int[][] sourceMatrix) {
        int x = 0;
        int y = sourceMatrix[0].length;
        for (int[] array : sourceMatrix) {
            x++;
        }
        int[][] transposeMatrix = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                transposeMatrix[j][i] = sourceMatrix[i][j];
            }
        }
        for (int[] array : sourceMatrix) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println("   ");
        for (int[] array : transposeMatrix) {
            System.out.println(Arrays.toString(array));
        }
        return transposeMatrix;
    }

    //Task 10* (IdentityMatrixChecker)
    boolean isIdentity(int[][] matrix) {
        boolean identity = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length) throw new IllegalArgumentException();

                identity = ((i == j) && (matrix[i][j] == 1)) || ((i != j) && (matrix[i][j] == 0)) ? true : false;

                if (identity == false) break;
            }
            if (identity == false) break;

        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(identity);
        return false;

    }

}

