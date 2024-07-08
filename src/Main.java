
public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        FullArray(employee);
        GetAllPersons(employee);
        System.out.println("Общая зарплата за месяц составлет: " + GetTotalSallaryMounth(employee));
        GetPersonMinSallary(employee);
        System.out.println("Сотрудник с минимальной зп: " + employee[GetPersonMinSallary(employee)]);
        System.out.println("Сотрудник с максимальной зп: " + employee[GetPersonMaxSallary(employee)]);
        System.out.println("Средняя зарплата за месяц всех сотрудников: " + GetAverageSallary(employee));
        PrintFullNames(employee);
        indexSalary(employee, 10);
        GetAllPersons(employee);

    }

    private static void indexSalary(Employee[] employee, int indexPercent) {
        for (int i = 0; i < employee.length; i++) {
            int tmp = employee[i].getSalary();
            tmp += (int) (tmp * indexPercent / 100);
            employee[i].setSalary(tmp);
        }
    }


    private static void PrintFullNames(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }

    private static int GetAverageSallary(Employee[] employee) {
        return (int) (GetTotalSallaryMounth(employee) / employee.length);
    }

    private static int GetPersonMaxSallary(Employee[] employee) {
        int maxSallary = employee[0].getSalary();
        int indexMaxSallary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSallary) {
                maxSallary = employee[i].getSalary();
                indexMaxSallary = i;
            }
        }
        return indexMaxSallary;
    }

    private static int GetPersonMinSallary(Employee[] employee) {
        int minSallary = employee[0].getSalary();
        int indexMinSallary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() < minSallary) {
                minSallary = employee[i].getSalary();
                indexMinSallary = i;
            }
        }
        return indexMinSallary;
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