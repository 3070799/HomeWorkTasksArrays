
public class Main {
    public static void main(String[] args) {

        TasksArrays tasksArrays = new TasksArrays();

        tasksArrays.fill(new int[10],5);

        tasksArrays.sum(new int[]{8,15,89,6});

        tasksArrays.findFirstPositive(new int[]{-2,15,0,2,-85});
        tasksArrays.findLastPositive(new int[]{-2,-15,0,-2,-85});

        tasksArrays.countPositives(new int[]{3,-2,-1,0,1,2,3,4,5,6});

        tasksArrays.printMatrix(new int[][]{{1,2,3,4},
                                            {1,2,3,4},
                                            {1,2,3,4},
                                            {1,2,3,4}});

        tasksArrays.calculateAverage(new int[][]{{1,2,3,4},
                                                    {5,6,7,8},
                                                    {9,0,1,2}});

    }
}
