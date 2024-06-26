public class Main {
    public static void main(String[] args) {
        task1(1976);

    }

    private static void task1(int year) {
        printNumberTask(1);
            if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.printf("%d год является високосным.\n", year);
            } else if (year > 1584) {
                System.out.printf("%d год не является високосным.\n", year);
            } else {
                System.out.println("Введен некорректный год.");
            }

        }

    private static void printNumberTask(int n) {
        System.out.printf("\n==========[ Task %d ]==========\n",n);
    }
}

