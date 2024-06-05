public class Main {
    public static void main(String[] args) {
        Task1_2();
        Task3();
        Task4();
    }

    private static void Task1_2() {
        System.out.printf("\n==========[ Task 1 ]==========\n");
        short clientOS = 0;

        if ("iOS".equals("iOS")) {
            clientOS = 0;
            System.out.printf("Установите версию приложения для iOS по ссылке.\n");
        } else if ("iOS".equals("Android")) {
            clientOS = 1;
            System.out.printf("Установите версию приложения для Android по ссылке.\n");
        }

        System.out.printf("\n==========[ Task 2 ]==========\n");
        int clientDeviceYear = 2015;

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

    private static void Task3() {
        System.out.printf("\n==========[ Task 3 ]==========\n");
        int year = 2011;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.printf("%d год является високосным.\n", year);
        } else if (year > 1584) {
            System.out.printf("%d год не является високосным.\n", year);
        } else {
            System.out.println("Введен некорректный год.");
        }

    }

    private static void Task4() {
        System.out.printf("\n==========[ Task 4 ]==========\n");
        int deliveryDistance = 95;
        int dayDelivery = 0;
        if (deliveryDistance < 20) {
            System.out.printf("Потребуется дней: %d\n", dayDelivery+1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.printf("Потребуется дней: %d\n", dayDelivery+2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.printf("Потребуется дней: %d\n", dayDelivery+3);
        } else {
            System.out.println("Доставки нет.");
        }
    }
}