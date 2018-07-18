import java.util.Arrays;

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
    
}
