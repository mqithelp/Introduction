public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }

    private static void Task10() {
        System.out.println("\n\n==========[ Task 10 ]==========");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %d = %d \n", i, 2 * i);
        }
    }

    private static void Task9() {
        System.out.println("\n\n==========[ Task 9 ]==========");
        int save = 29000;
        int totalSave = 0;
        for (int i = 1; i <= 12; i++) {
            totalSave += (int) (totalSave * 0.01);
            totalSave += save;
            System.out.printf("«Месяц %d, сумма накоплений равна %d рублей.\n", i, totalSave);
        }

    }

    private static void Task8() {
        System.out.println("\n\n==========[ Task 8 ]==========");
        int save = 29000;
        int totalSave = 0;
        for (int i = 1; i <= 12; i++) {
            totalSave += save;
            System.out.printf("«Месяц %d, сумма накоплений равна %d рублей.\n", i, totalSave);
        }

    }

    private static void Task7() {
        System.out.println("\n\n==========[ Task 7 ]==========");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%d\t", i);
        }
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