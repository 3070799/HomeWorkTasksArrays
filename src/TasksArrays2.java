import java.util.ArrayList;
import java.util.Scanner;

public class TasksArrays2 {
    double ArrayCalculateAverage(int[] array){
        int sum = 0;
        double count = 0;

        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        count = sum/array.length;
        System.out.println(count);
        return count;
    }

    int task4(int[] array){
        int nMax = 0;
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max = array[i];
                nMax = 1;
            }else if (max == array[i]){
                nMax += 1;
            }
        }

        System.out.println(nMax);
        return nMax;
    }
    void task5 (){
        int[] arrey = new int[5];
        int[] arrey2 = new int[arrey.length];
        for (int i = 0; i <arrey.length ; i++) {
            arrey[i] = i;
        }
        System.out.println(java.util.Arrays.toString(arrey));

        for (int i = 0; i <arrey2.length ; i++) {
            arrey2[i] = arrey[arrey.length - (i+1)];


        }
        System.out.println(java.util.Arrays.toString(arrey2));
    }
    int task3 (){
        int index = -1;
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == x){
                index = i;
            }
        }
        System.out.println(java.util.Arrays.toString(array));
        System.out.println(index);
        return index;
    }
    boolean task7(){
        boolean x = false;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        char[] m = s.toCharArray();
        System.out.println(java.util.Arrays.toString(m));
        for (int i = 0; i < m.length ; i++) {
            if(m[i] != ' '){
                s1 += m[i];
            }
        }
        char[] m1 = s1.toCharArray();

        System.out.println(s1);
        System.out.println(java.util.Arrays.toString(m1));
        for (int i = 0; i <m1.length ; i++) {
            if(m1[i] == m1[m1.length - (i+1)]){
                x = true;
            }
        }
        System.out.println(x);
        return x;
    }

}
