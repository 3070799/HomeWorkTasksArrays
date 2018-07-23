import java.util.Arrays;

//Написать метод уплотнения матрицы за счет удаления из нее строк и столбцов, заполненных нулями.
// Исходная матрица не должна изменяться. Предполагается, что матрица прямоугольная.
//int[][] packMatrix(int[][] sourceMatrix)
//
//Пример работы:
//packMatrix(new int[][]{
//{1, 2, 3},
//{0, 0, 0},
//{4, 5, 6}	})
// => {
//{1, 2, 3},
//{4, 5, 6}	}
//
//packMatrix(new int[][]{
//{1, 0, 2},
//{0, 0, 0},
//{3, 0, 4}	})
// => {
// {1, 2},
//{3, 4}		}
public class ArraysLvl2Task5 {
    int[][] packMatrix(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            int zeroFinderRow = 0;
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] == 0){
                    zeroFinderRow++;
                }
            }
            if (zeroFinderRow == matrix[i].length) {
                matrix = matrixDeleteRow(matrix,i);
            }
        }
        for (int i = 0; i <matrix[0].length ; i++) {
            int zeroFinderCol = 0;
            for (int j = 0; j <matrix.length ; j++) {
                if (matrix[j][i] == 0){
                    zeroFinderCol++;
                }
            }
            if (zeroFinderCol == matrix.length){
                matrix = matrixDeleteCol(matrix,i) ;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }
    public static int [][] matrixDeleteRow(int matrix[][], int row){
        int [][] packMatrix =  new int[matrix.length-1][matrix[row].length];
        for (int i = 0; i <matrix.length - 1 ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (i < row){
                    packMatrix[i][j] = matrix[i][j];
                }else {
                    packMatrix[i][j] = matrix[i+1][j];
                }
            }
        }
        return packMatrix;
    }
    public static int [][] matrixDeleteCol(int matrix[][], int col){
        int [][] packMatrix = new int[matrix.length][matrix[0].length - 1];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length - 1 ; j++) {
                if (j < col){
                    packMatrix[i][j] = matrix[i][j];
                }else {
                    packMatrix[i][j] = matrix[i][j+1];
                }
            }
        }
        return packMatrix;
    }
}
