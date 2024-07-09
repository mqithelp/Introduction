
public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("==========[ Базовая сложность ]==========");
        employeeBook.printAllPersonsData();
        System.out.println("Общая зарплата за месяц составлет: "
                + employeeBook.getTotalSalaryMonth());
//        System.out.println("Сотрудник с минимальной зп: "
//                + employee[employeeBook.getPersonMinSalary()]);
//        System.out.println("Сотрудник с максимальной зп: "
//                + employee[getPersonMaxSalary(employee)]);
        System.out.println("Средняя зарплата за месяц всех сотрудников: "
                + employeeBook.getAverageSalary());
        employeeBook.printFullNames();

        System.out.println("==========[ Повышенная сложность ]==========");
        int indexSalary = 7;
        System.out.println("Индексируем зарплату на " + indexSalary + "%");
        employeeBook.indexSalary(indexSalary);
        employeeBook.printAllPersonsData();
        int department = 4; //переменная для задания повышенной сложности

        System.out.printf("Сотрудники %d отдела. \n", department);
//        System.out.println("Сотрудник с минимальной зп в отделе: " +
//                employee[getPersonMinSalary(employee, department)]);
//        System.out.println("Сотрудник с максимальной зп в отделе: " +
//                employee[getPersonMaxSalary(employee, department)]);
        System.out.println("Общая зарплата за месяц отдела " + department + " составлет: "
                + employeeBook.getTotalSalaryMonth(department));
        System.out.println("Средняя зарплата за месяц сотрудников отдела " +
                department + ": " + employeeBook.getAverageSalary(department));

        System.out.println("Индексируем зарплату в отделе " + department + ", на " + indexSalary + "%");
        int indexSalaryDepartment = 10;
        employeeBook.indexSalary(indexSalaryDepartment, department);
        employeeBook.printAllPersonsData(department);
        System.out.println("===[ Ищем сотрудников больше или меньше определенной зарплаты. ]====");
        int xSalary = 34000;
        System.out.println("Сотрудники с зарплатой ниже " + xSalary);
        employeeBook.findAndPrintBeforeSalary(xSalary);
        System.out.println("Сотрудники с зарплатой выше " + xSalary);
        employeeBook.findAndPrintAboveSalary(xSalary);
    }


}