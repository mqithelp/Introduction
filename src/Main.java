public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task8() {
        final int CYCLE_PERIOD = 79;

        System.out.println("\n\n==========[ Task 8 ]==========");
        final int CURRENT_YEAR = 2024;
        final int YEAR_BEFORE = CURRENT_YEAR - 200;
        final int YEAR_ABOVE = CURRENT_YEAR + 100;
        int yearCount = YEAR_BEFORE;
        while (yearCount < YEAR_ABOVE) {
            if (yearCount % CYCLE_PERIOD == 0) {
                System.out.println(yearCount);
            }
            yearCount++;
        }
    }

    private static void task7() {
        System.out.println("\n\n==========[ Task 7 ]==========");
        final int DAY_OF_WEEK = 7;
        final int DAY_OF_MONTH = 31;
        final int FRIDAY_DAY = 4;
        int fridayCount = 0;
        for (int i = 1; i <= DAY_OF_MONTH; i++) {
            if (FRIDAY_DAY + fridayCount * DAY_OF_WEEK == i) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", i);
                fridayCount++;
            }
        }
    }

    private static void task6() {
        System.out.println("\n\n==========[ Task 6 ]==========");
        final int PERCENT_BANK = 7;
        final int TOTAL_YEAR = 9;
        final int MONTHS_OF_YEAR = 12;
        float percentMount = PERCENT_BANK / 12f;
        int totalCash = 15_000;

        for (int i = 1; i <= MONTHS_OF_YEAR * TOTAL_YEAR; i++) {
            totalCash += (int) (totalCash * percentMount / 100);
            if (i % 6 == 0) {
                System.out.printf("В %d месяце накоплено %d руб.\n", i, totalCash);
            }
        }
    }

    private static void task5() {
        System.out.println("\n\n==========[ Task 5 ]==========");
        final int STEP_PERIOD = 6;
        final int TARGET_CASH = 12_000_000;
        final int ANNUAL_INTEREST_RATE = 7;
        float monthlyInterestRate = ANNUAL_INTEREST_RATE / 12f;
        int mount = 1;
        int cashInvest = 15_000;
        while (cashInvest < TARGET_CASH) {
            cashInvest += (int) (cashInvest * monthlyInterestRate / 100);
            if (mount++ % STEP_PERIOD == 0) {
                System.out.printf("В %d месяце накоплено %d руб.\n", mount - 1, cashInvest);
            }
        }
    }

    private static void task4() {
        System.out.println("\n\n==========[ Task 4 ]==========");
        final int TARGET_CASH = 12_000_000;
        final int ANNUAL_INTEREST_RATE = 7;
        float percentMount = ANNUAL_INTEREST_RATE / 12f;
        int mount = 1;
        int totalCash = 15_000;
        while (totalCash < TARGET_CASH) {
            totalCash += (int) (totalCash * percentMount / 100);
            System.out.printf("В %d месяце накоплено %d руб.\n", mount++, totalCash);
        }
    }

    private static void task3() {
        System.out.println("\n\n==========[ Task 3 ]==========");
        final int BIRTH_RATE = 17;
        final int DEATH_RATE = 8;
        final int PER_1000 = 1000;
        final int YEAR = 10;
        int populationY = 12_000_000;

        for (int i = 1; i <= YEAR; i++) {
            populationY += populationY / PER_1000 * BIRTH_RATE - populationY / PER_1000 * DEATH_RATE;
            System.out.printf("Год %d, численность населения составляет %d.\n", i, populationY);
        }
    }

    private static void task2() {
        System.out.println("\n\n==========[ Task 2 ]==========");
        final int START_NUMBER = 1;
        final int END_NUMBER = 10;
        int i = START_NUMBER;
        while (i <= END_NUMBER) {
            System.out.printf("%d\t", i++);
        }
        System.out.println();
        for (int j = END_NUMBER; j > 0; j--) {
            System.out.printf("%d\t", j);
        }
    }

    private static void task1() {
        System.out.println("\n\n==========[ Task 1 ]==========");

        final int SAVINGS_GOAL = 2_459_000;
        final int MONTHLY_SAVINGS = 15_000;
        int month = 0;
        int monthCash = 0;
        final float MONTHLY_INTEREST_RATE = 1 / 100f;
        while (SAVINGS_GOAL > monthCash) {
            month++;
            monthCash = monthCash + ((int) (monthCash * MONTHLY_INTEREST_RATE) + MONTHLY_SAVINGS);
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", month, monthCash);
        }

    }

}
