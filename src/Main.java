import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TasksArrays tasksArrays = new TasksArrays();
        TasksArrays2 tasksArrays2 = new TasksArrays2();
        TasksArraysLvl2 tasksArraysLvl2 = new TasksArraysLvl2();

        tasksArraysLvl2.createSpiral(sc.nextInt(),sc.nextInt());
    }

}
