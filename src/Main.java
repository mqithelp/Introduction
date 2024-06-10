public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();

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