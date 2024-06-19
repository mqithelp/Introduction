public class Main {
    public static void main(String[] args) {
        int[] records = {12000, 34000, 27000, 30000, 17000};
        task1(records);
    }

    private static void task1(int[] records) {
        System.out.println("\n==========[ Task 1 ]==========");
        int sum = 0;
        for (int i : records) {
            sum += i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", sum);
    }


}