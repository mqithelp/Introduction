public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
    }

    private static void Task6() {
        System.out.println("\n\n==========[ Task 6 ]==========");
        for (int i = 7; i <= 98; i += 7) {
            System.out.printf("%d\t", i);
        }
    }

    private static void Task5() {
        System.out.println("\n\n==========[ Task 5 ]==========");
        int j = 0;
        for (int i = 1904; i <= 2096; i += 4) {
            if (j % 10 == 0 && j != 0) {
                System.out.println();
            }
            j++;
            System.out.printf("%d\t", i);
        }
    }

    private static void Task4() {
        System.out.println("\n\n==========[ Task 4 ]==========");
        for (int i = 10; i >= -10; i--) {
            System.out.printf("%d\t", i);
        }
    }

    private static void Task3() {
        System.out.println("\n\n==========[ Task 3 ]==========");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
    }

    private static void Task2() {
        System.out.println("\n\n==========[ Task 2 ]==========");
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d\t", i);
        }
    }

    private static void Task1() {
        System.out.println("\n\n==========[ Task 1 ]==========");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t", i);
        }
    }
}