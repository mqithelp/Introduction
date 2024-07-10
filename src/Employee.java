import java.util.Objects;


public class Employee {
    public static int countId = 0;
    private int id;
    private final String surname;
    private final String name;
    private final String patronymic;
    private int department;
    private int salary;

    public static int getPersonsDepartment(int id) {
        return EmployeeBook.personsDepartment[id];
    }

    public static void decreaseDepartment(int id) {
        EmployeeBook.personsDepartment[id]--;
    }

    public static void increaseDepartment(int id) {
        EmployeeBook.personsDepartment[id]++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        if (department <= 1 || department >= 6) {
            department = 1;
        }
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = countId;
        countId++;
        EmployeeBook.personsDepartment[department]++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, department, salary);
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                "\tФИО: " + surname + ' ' +
                name + ' ' + patronymic +
                ". Отдел=" + department +
                ". Зарплата=" + salary;
    }

    public String getFullName() {
        return surname + ' ' + name + ' ' + patronymic;
    }
}
