public class Main {
    public static void main(String[] args) {
            Task1();
            Task2();
           }

    private static void Task2() {
        System.out.println("\n==========[ Task 2 ]==========");
        for (int i = 10; i >= 1 ; i--) {
            System.out.printf("%d\t",i);
        }
    }

    private static void Task1() {
        System.out.println("\n==========[ Task 1 ]==========");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t",i);
        }
    }
}