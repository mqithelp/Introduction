public class Main {
    public static void main(String[] args) {
        System.out.printf("\n==========[ Task 1 ]==========\n");
        short clientOS=0;

        String identifyOS = "iOS";

        if (identifyOS.equals("iOS")) {
            clientOS = 0;
            System.out.printf("Установите версию приложения для iOS по ссылке.\n");
        } else if (identifyOS.equals("Android")) {
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
}