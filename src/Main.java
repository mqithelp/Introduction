public class Main {
    public static void main(String[] args) {
        int[] records = {12000, 34000, 27000, 30000, 17000};
        task1(records);
        task2(records);
        task3(records);
        task4();
    }

    private static void task4() {
        System.out.println("\n==========[ Task 4 ]==========");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i : reverseFullName) System.out.print((char) i);
        System.out.println();
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    private static void task3(int[] records) {
        System.out.println("\n==========[ Task 3 ]==========");
        final int WEAK_OF_MOUNTH = records.length;
        int sum = 0;
        for (int i : records) sum += i;
        float avg_money = (float) sum / WEAK_OF_MOUNTH;
        System.out.printf("Средняя сумма трат за месяц составила %f руб.\n", avg_money);
    }

    private static void task2(int[] records) {
        System.out.println("\n==========[ Task 2 ]==========");
        int min = records[0];
        int max = records[0];
        for (int i : records) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.printf("«Минимальная сумма трат за неделю составила %d рублей. \n" +
                "Максимальная сумма трат за неделю составила %d рублей.\n", min, max);
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