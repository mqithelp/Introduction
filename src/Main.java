public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }

    private static void Task7() {
        System.out.println("\n\n==========[ Task 7 ]==========");
        int fridayDay = 4;
        int fridayCount = 0;
        for (int i = 1; i <= 31; i++) {
            if (fridayDay + fridayCount * 7 == i) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", i);
                fridayCount++;
            }
        }
    }

    private static void Task6() {
        System.out.println("\n\n==========[ Task 6 ]==========");
        int percentBank = 7;
        float percentMount = percentBank / 12f;
        int totalCash = 15_000;
        for (int i = 1; i <= 9 * 12; i++) {
            totalCash += (int) (totalCash * percentMount / 100);
            if (i % 6 == 0) {
                System.out.printf("В %d месяце накоплено %d руб.\n", i, totalCash);
            }


        }
    }

    private static void Task5() {
        System.out.println("\n\n==========[ Task 5 ]==========");
        int targetCash = 12_000_000;
        int percentBank = 7;
        float percentMount = percentBank / 12f;
        int mount = 1;
        int totalCash = 15_000;
        while (totalCash < targetCash) {
            totalCash += (int) (totalCash * percentMount / 100);
            if (mount++ % 6 == 0) {
                System.out.printf("В %d месяце накоплено %d руб.\n", mount - 1, totalCash);
            }
        }
    }

    private static void Task4() {
        System.out.println("\n\n==========[ Task 4 ]==========");
        int targetCash = 12_000_000;
        int percentBank = 7;
        float percentMount = percentBank / 12f;
        int mount = 1;
        int totalCash = 15_000;
        while (totalCash < targetCash) {
            totalCash += (int) (totalCash * percentMount / 100);
            System.out.printf("В %d месяце накоплено %d руб.\n", mount++, totalCash);
        }
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