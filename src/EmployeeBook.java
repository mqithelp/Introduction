public class EmployeeBook {
    private final Employee[] employee = new Employee[10];

    public EmployeeBook() {
        fullArray(this.employee);
    }

    public void findAndPrintBeforeSalary(int xSalary) {
        for (Employee value : this.employee) {
            if (value.getSalary() < xSalary) {
                System.out.println("id=" + value.getId() + ". " +
                        value.getFullName() + ".\tЗарплата = " + value.getSalary());
            }
        }
    }

    public void findAndPrintAboveSalary(int xSalary) {
        for (Employee value : employee) {
            if (value.getSalary() >= xSalary) {
                System.out.println("id=" + value.getId() + ". " +
                        value.getFullName() + ".\tЗарплата = " + value.getSalary());
            }
        }
    }

    public void indexSalary(int indexPercent) {
        for (Employee value : employee) {
            int tmp = value.getSalary();
            tmp += tmp * indexPercent / 100;
            value.setSalary(tmp);
        }
    }

    public void indexSalary(int indexPercent, int departmentNum) {
        for (Employee value : employee) {
            if (value.getDepartment() == departmentNum) {
                int tmp = value.getSalary();
                tmp += tmp * indexPercent / 100;
                value.setSalary(tmp);
            }
        }
    }


    public void printFullNames() {
        for (Employee value : employee) {
            System.out.println(value.getFullName());
        }
    }

    public int getAverageSalary() {
        return getTotalSalaryMonth() / employee.length;
    }

    public int getAverageSalary(int department) {

        return getTotalSalaryMonth(department) / Employee.getPersonsDepartment(department);
    }


    public String getPersonMaxSalary() {
        int maxSalary = employee[0].getSalary();
        int indexMaxSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                indexMaxSalary = i;
            }
        }
        return employee[indexMaxSalary].toString();
    }

    public String getPersonMaxSalary(int department) {
        int maxSalary = Integer.MIN_VALUE;
        int indexMaxSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                indexMaxSalary = i;
            }
        }
        return employee[indexMaxSalary].toString();
    }


    public String getPersonMinSalary() {
        int minSalary = employee[0].getSalary();
        int indexMinSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                indexMinSalary = i;
            }
        }
        return employee[indexMinSalary].toString();
    }

    public String getPersonMinSalary(int department) {
        int minSalary = Integer.MAX_VALUE;
        int indexMinSalary = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && (employee[i].getSalary() < minSalary)) {
                minSalary = employee[i].getSalary();
                indexMinSalary = i;
            }
        }
        return employee[indexMinSalary].toString();
    }


    public int getTotalSalaryMonth() {
        int total = 0;
        for (Employee value : employee) {
            total += value.getSalary();
        }
        return total;
    }

    public int getTotalSalaryMonth(int department) {
        int total = 0;
        for (Employee value : employee) {
            if (value.getDepartment() == department) {
                total += value.getSalary();
            }
        }
        return total;
    }

    public void printAllPersonsData(int departmentNum) {
        for (Employee value : employee) {
            if (value.getDepartment() == departmentNum) {
                System.out.println("id=" + value.getId() + ". " +
                        value.getFullName() + ".\tЗарплата = " + value.getSalary());
            }
        }
    }

    public void printAllPersonsData() {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    private void fullArray(Employee[] employee) {
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

    public void deletePerson(int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                Employee.decreaseDepartment(employee[i].getDepartment());
                employee[i] = null;
            }
        }
    }
}
