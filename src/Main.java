public class Main {
    public static void main(String[] args) {
        calculateLeapYear(1976); //Task 1
        downloadApp(2015,0); //Task 2
        sendCard(95); //Task 3
    }

    private static void sendCard(int deliveryDistance) {
        printNumberTask(3);
        int dayDelivery = 0;
        if (deliveryDistance <= 20) {
            dayDelivery += 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayDelivery += 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayDelivery += 3;
        } else {
            System.out.println("Доставки нет.");
        }
        if (dayDelivery > 0) {
            System.out.printf("Потребуется дней: %d\n",dayDelivery);
        }
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

