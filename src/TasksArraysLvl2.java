import java.util.Arrays;
import java.util.Scanner;

public class TasksArraysLvl2 {
    //Task 1** (FrequentElemFinder)
    //Написать метод поиска элемента, который чаще всего встречается в массиве. Если таких элементов несколько, вернуть самый первый.
    //Использование коллекций запрещено.
    //int findFrequentElem(int[] array)
    //
    //Пример работы:
    //findFrequentElem(new int[]{1, 2, 1, 0, 3}) == 1
    //findFrequentElem(new int[]{2, 1, 2, 1, 0, 3}) == 2
    int findFrequentElem(int[] array){
        int [] countQuantityElem = new int[array.length];
        int index = 0;
        int maxQuantityElem = 0;
        int countQuantity;
        for (int i = 0; i <array.length ; i++) {
            countQuantity =1;
            for (int j = 0; j <array.length ; j++) {
                if (i != j && array[i] == array[j]){
                    countQuantity++;
                }
            }
            countQuantityElem[i] = countQuantity;
        }

        for (int i = 0; i <countQuantityElem.length ; i++) {
            if(maxQuantityElem < countQuantityElem[i]){
                maxQuantityElem = countQuantityElem[i];
                index = i;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(countQuantityElem));
        System.out.println(array[index]);
        return array[index];
    }

    //Task 2** (CyclicShifter)
    //Написать метод циклического сдвига массива на shiftPositions. Если shiftPositions - положительное, сдвиг вправо, иначе влево.
    //void cyclicShift(int[] array, int shiftPositions)
    //
    //Пример работы:
    //cyclicShift(new int[]{0, 1, 2, 3, 4}, 1). 	{4, 0, 1, 2, 3}
    //cyclicShift(new int[]{0, 1, 2, 3, 4}, -1). 	{1, 2, 3, 4, 0}
    //cyclicShift(new int[]{0, 1, 2, 3, 4}, 0). 	{0, 1, 2, 3, 4}
    //cyclicShift(new int[]{0, 1, 2, 3, 4}, 5). 	{0, 1, 2, 3, 4}
    void cyclicShift(int[] array, int shiftPositions){
        int[] array1 = new int[array.length];
        if (shiftPositions > 0){
            for (int i = 0; i <array.length ; i++) {
                array1[i] = array[(i + array.length -shiftPositions) % array.length];
            }
        }else{
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[(i - shiftPositions) % array.length];
            }
        }
        System.out.println(Arrays.toString(array1));
    }

    //Task 3** (SpiralCreator)
    //Написать метод создания матрицы размера rows*cols, заполненной в виде спирали, начиная с 1. Если rows, cols – отрицательные, бросить исключение IllegalArgumentException.
    //int[][] createSpiral(int rows, int cols)
    //
    //Пример работы:
    //createSpiral(3, 3) => {	{1, 2, 3},
    //{8, 9, 4},
    //{7, 6, 5}	}
    //createSpiral(2, 4) => {	{1, 2, 3, 4},
    //{8, 7, 6, 5}	}
    //createSpiral(-1, 1)  IllegalArgumentException
    int[][] createSpiral(int rows, int cols){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[rows][cols];
        System.out.println("Please enter your peremenuy x");
        int x = sc.nextInt();
        int x1 = x-1;
        for (int i = 0; i < cols ; i++) {
            array[0][i] = x;
            x++;
        }
        for (int i = 1; i < rows ; i++) {
            array[i][cols-1] = x;
            x++;
        }
        for (int i = cols -2; i >= 0  ; i--) {
            array[rows-1][i] = x;
            x++;
        }
        for (int i = rows - 2; i > 0 ; i--) {
            array[i][0] = x;
            x++;
        }
        int c = 1;
        int d = 1;
        while (x < rows * cols + x1) {
            //Движемся вправо.
            while (array[c][d + 1] == 0) {
                array[c][d] = x;
                x++;
                d++;
            }

            //Движемся вниз.
            while (array[c + 1][d] == 0) {
                array[c][d] = x;
                x++;
                c++;
            }

            //Движемся влево.
            while (array[c][d - 1] == 0) {
                array[c][d] = x;
                x++;
                d--;
            }

            //Движемся вверх.
            while (array[c - 1][d] == 0) {
                array[c][d] = x;
                x++;
                c--;
            }
        }
        array[c][d] = x;





        for (int i = 0; i < array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        return array;
    }

    //Task 4** (PascalTriangleCreator)
    //Написать метод создания треугольника Паскаля размера n+1. Если n < 0, бросить исключение IllegalArgumentException.
    //Хитрые формулы использовать не нужно. Просто найдите закономерность в построении треугольника.
    //https://ru.wikipedia.org/wiki/Треугольник_Паскаля
    //int[][] createPascalTriangle(int n)
    //
    //Пример работы:
    //createPascalTriangle(0) => {	{1}	}
    //createPascalTriangle(3) => {	{1},
    //					{1, 1},
    //					{1, 2, 1},
    //					{1, 3, 3, 1}	}
    //createPascalTriangle(-1)  IllegalArgumentException
    int[][] createPascalTriangle(int n) {
        int[][] matrixPasc = new int[n + 1][];
        if (n >= 0) {
            for (int i = 0; i < matrixPasc.length; i++) {
                matrixPasc[i] = new int[i + 1];
                    for (int j = 0; j < matrixPasc[i].length; j++) {
                        if (j == 0) matrixPasc[i][j] = 1;
                        else if (j == matrixPasc[i].length - 1) matrixPasc[i][j] = 1;
                        else {
                            matrixPasc[i][j] = matrixPasc[i - 1][j - 1] + matrixPasc[i - 1][j];
                        }
                    }
            }
        }else throw new IllegalArgumentException("IllegalArgumentException");


        for (int i = 0; i < matrixPasc.length; i++) {
            System.out.println(Arrays.toString(matrixPasc[i]));
        }
        return matrixPasc;
    }

}
