public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task3() {
        System.out.println("\n\n==========[ Task 3 ]==========");
        String fullname = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullname.replace('ё','e'));
    }

    private static void task2() {
        System.out.println("\n\n==========[ Task 2 ]==========");
        String fullName ="Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task1() {
        System.out.println("\n\n==========[ Task 1 ]==========");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

    }

}