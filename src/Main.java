public class Main {
    public static void main(String[] args) {
        calculateLeapYear(1976); //Task 1
        downloadApp(2015,0); //Task 2
        sendCard(95);
    }

    private static void sendCard(int deliveryDistance) {

    }

    private static void downloadApp(int clientDeviceYear, int clientOS) {
        printNumberTask(2);
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static void calculateLeapYear(int year) {
        printNumberTask(1);
            if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.printf("%d год является високосным.\n", year);
            } else if (year > 1584) {
                System.out.printf("%d год не является високосным.\n", year);
            } else {
                System.out.println("Введен некорректный год.");
            }

        }

    private static void printNumberTask(int numberTask) {
        System.out.printf("\n==========[ Task %d ]==========\n",numberTask);
    }
}

