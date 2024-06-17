import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasksAllInOne();
    }

    private static void tasksAllInOne() {
        System.out.println("\n\n==========[ Task 1 ]==========");
        System.out.println("Создали три массива");
        int[] arraysOne = new int[]{1, 2, 3};
        double[] arraysTwo = {1.57, 7.654, 9.986};
        boolean[] arraysThree = new boolean[]{true, false, false, true};
        System.out.println("\n==========[ Task 2 ]==========");
        System.out.println(Arrays.toString(arraysOne));
        System.out.println(Arrays.toString(arraysTwo));
        System.out.println(Arrays.toString(arraysThree));
        System.out.println("\n==========[ Task 3 ]==========");
        for (int i = arraysOne.length-1; i > 0; i--) {
            System.out.print(arraysOne[i]+", ");
        }
        System.out.println(arraysOne[0]);
        for (int i = arraysTwo.length-1; i > 0; i--) {
            System.out.print(arraysTwo[i] + ", ");
        }
        System.out.println(arraysTwo[0]);
        System.out.println("\n==========[ Task 4 ]==========");
        for (int i = 0; i < arraysOne.length; i++) {
            if (arraysOne[i] % 2 != 0) {
                arraysOne[i] +=1;
            }
        }
        System.out.println(Arrays.toString(arraysOne));
    }


}