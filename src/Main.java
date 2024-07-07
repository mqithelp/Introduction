
public class Main {
    public static void main(String[] args) {
     Employee[] employee = new Employee[10];
     FullArray(employee);
     GetAllPersons(employee);
        System.out.println("Общая зарплата за месяц составлет: " + GetTotalSallaryMounth(employee));

    }

    private static int GetTotalSallaryMounth(Employee[] employee) {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
        }
        return total;
    }

    private static void GetAllPersons(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void FullArray(Employee[] employee) {
        employee[0] = new Employee("Касперский", "Евгений", "Валентинович", 1, 28000);
        employee[1] = new Employee("Баранов", "Андрей", "Николаевич", 3, 32500);
        employee[2] = new Employee("Зыкин", "Сергей", "Викторович", 2, 30000);
        employee[3] = new Employee("Карпов", "Анатолий", "Евгеньевич", 4, 35000);
        employee[4] = new Employee("Паролли", "Давид", "Романович", 5, 31000);
        employee[5] = new Employee("Зубков", "Александр", "Юрьевич", 1, 29500);
        employee[6] = new Employee("Шилов", "Николай", "Николаевич", 3, 33000);
        employee[7] = new Employee("Брябрин", "Владимир", "Михайлович", 2, 31500);
        employee[8] = new Employee("Волнов", "Игорь", "Николаевич", 5, 34000);
        employee[9] = new Employee("Густафик", "Владимир", "Михайлович", 4, 32000);
    }

}