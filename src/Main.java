public class Main {
    public static void main(String[] args) {
        System.out.printf("\n==========[ Task 1 ]==========\n");
        short clientOS;

        String identifyOS = "Android";

        if (identifyOS.equals("iOS")) {
            clientOS = 0;
            System.out.printf("Установите версию приложения для iOS по ссылке.\n");
        } else if (identifyOS.equals("Android")) {
            clientOS = 1;
            System.out.printf("Установите версию приложения для Android по ссылке.\n");
        }
    }
}