public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    private static void Task3() {
        System.out.println("\n\n==========[ Task 3 ]==========");
        int totalY = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            totalY += totalY / 1000 * 17 - totalY / 1000 * 8;
            System.out.printf("Год %d, численность населения составляет %d.\n", i, totalY);
        }
    }

    private static void Task2() {
        System.out.println("\n\n==========[ Task 2 ]==========");
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d\t", i++);
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.printf("%d\t", j);
        }
    }

    private static void Task1() {
        System.out.println("\n\n==========[ Task 1 ]==========");
        int totalCash = 2_459_000;
        int incCash = 15_000;
        int month = 0;
        int monthCash = 0;
        while (totalCash > monthCash) {
            month++;
            monthCash += incCash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", month, monthCash);
        }

    }

}