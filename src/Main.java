import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TasksArrays tasksArrays = new TasksArrays();
        TasksArrays2 tasksArrays2 = new TasksArrays2();
        TasksArraysLvl2 tasksArraysLvl2 = new TasksArraysLvl2();
        ArraysLvl2Task5 arraysLvl2Task5 = new ArraysLvl2Task5();

        int [][] matrix = new int[][]{
                {1, 0, 2, 3, 0},
                {0, 0, 0, 0, 0},
                {4, 0, 5, 6, 0},
                {0, 0, 0, 0, 0},
                {7, 0, 8, 9, 0},
                {0, 0, 0, 0, 0}
        };
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("");

        arraysLvl2Task5.packMatrix(matrix);



        }

}
