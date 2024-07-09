
public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        fullArray(employee); //Заполняем массив

        System.out.println("==========[ Базовая сложность ]==========");
        printAllPersonsData(employee);
        System.out.println("Общая зарплата за месяц составлет: "
                + getTotalSalaryMonth(employee));
        System.out.println("Сотрудник с минимальной зп: "
                + employee[getPersonMinSalary(employee)]);
        System.out.println("Сотрудник с максимальной зп: "
                + employee[getPersonMaxSalary(employee)]);
        System.out.println("Средняя зарплата за месяц всех сотрудников: "
                + getAverageSalary(employee));
        printFullNames(employee);

        System.out.println("==========[ Повышенная сложность ]==========");
        indexSalary(employee, 7);
        printAllPersonsData(employee);
        int department = 4; //переменная для задания повышенной сложности

        System.out.printf("Сотрудники %d отдела. \n", department);
        System.out.println("Сотрудник с минимальной зп в отделе: " +
                employee[getPersonMinSalary(employee, department)]);
        System.out.println("Сотрудник с максимальной зп в отделе: " +
                employee[getPersonMaxSalary(employee, department)]);
        System.out.println("Общая зарплата за месяц отдела " + department + " составлет: "
                + getTotalSalaryMonth(employee, department));
        System.out.println("Средняя зарплата за месяц сотрудников отдела " +
                department + ": " + getAverageSalary(employee, department));

        indexSalary(employee, 10, department);
        printAllPersonsData(employee, department);
        System.out.println("===[ Ищем сотрудников больше или меньше определенной зарплаты. ]====");
        int xSalary = 34000;
        System.out.println("Сотрудники с зарплатой выше " + xSalary);
        findAndPrintAboveSalary(employee, xSalary);
        System.out.println("Сотрудники с зарплатой ниже " + xSalary);
        findAndPrintBeforeSalary(employee, xSalary);
    }

    private static void findAndPrintBeforeSalary(Employee[] employee, int xSalary) {
        for (Employee value : employee) {
            if (value.getSalary() < xSalary) {
                System.out.println("id=" + value.getId() + ". " +
                        value.getFullName()+".\tЗарплата = "+value.getSalary());
            }
        }
    }

    private static void findAndPrintAboveSalary(Employee[] employee, int xSalary) {
        for (Employee value : employee) {
            if (value.getSalary() >= xSalary) {
                System.out.println("id=" + value.getId() + ". " +
                        value.getFullName()+".\tЗарплата = "+value.getSalary());
            }
        }
    }

    private static void indexSalary(Employee[] employee, int indexPercent) {
        for (Employee value : employee) {
            int tmp = value.getSalary();
            tmp += tmp * indexPercent / 100;
            value.setSalary(tmp);
        }
    }

    private static void indexSalary(Employee[] employee, int indexPercent, int departmentNum) {
        for (Employee value : employee) {
            if (value.getDepartment() == departmentNum) {
                int tmp = value.getSalary();
                tmp += tmp * indexPercent / 100;
                value.setSalary(tmp);
            }
        }
    }


    private static void printFullNames(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value.getFullName());
        }
    }

    private static int getAverageSalary(Employee[] employee) {
        return getTotalSalaryMonth(employee) / employee.length;
    }

    private static int getAverageSalary(Employee[] employee, int department) {

        return getTotalSalaryMonth(employee, department) / Employee.getPersonsDepartment(department);
    }


    private static int getPersonMaxSalary(Employee[] employee) {
        int maxSalary = employee[0].getSalary();
        int indexMaxSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                indexMaxSalary = i;
            }
        }
        return indexMaxSalary;
    }

    private static int getPersonMaxSalary(Employee[] employee, int department) {
        int maxSalary = employee[0].getSalary();
        int indexMaxSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                indexMaxSalary = i;
            }
        }
        return indexMaxSalary;
    }


    private static int getPersonMinSalary(Employee[] employee) {
        int minSalary = employee[0].getSalary();
        int indexMinSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                indexMinSalary = i;
            }
        }
        return indexMinSalary;
    }

    private static int getPersonMinSalary(Employee[] employee, int department) {
        int minSalary = Integer.MAX_VALUE;
        int indexMinSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && (employee[i].getSalary() < minSalary)) {
                minSalary = employee[i].getSalary();
                indexMinSalary = i;
            }
        }
        return indexMinSalary;
    }


    private static int getTotalSalaryMonth(Employee[] employee) {
        int total = 0;
        for (Employee value : employee) {
            total += value.getSalary();
        }
        return total;
    }

    private static int getTotalSalaryMonth(Employee[] employee, int department) {
        int total = 0;
        for (Employee value : employee) {
            if (value.getDepartment() == department) {
                total += value.getSalary();
            }
        }
        return total;
    }

    private static void printAllPersonsData(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    private static void printAllPersonsData(Employee[] employee, int departmentNum) {
        for (Employee value : employee) {
            if (value.getDepartment() == departmentNum) {
                System.out.println("id=" + value.getId() + ". " +
                        value.getFullName()+".\tЗарплата = "+value.getSalary());
            }
        }
    }

    public static void fullArray(Employee[] employee) {
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