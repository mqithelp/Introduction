public class Main {
    public static void main(String[] args) {
        Task1();
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