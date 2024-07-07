import java.util.Objects;

public class Employee {
    public static int countId = 0;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = countId;
        countId++;
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
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, department, salary);
    }

    @Override
    public String toString() {
        return "ФИО: " +
                 surname + ' ' +
                 name + ' ' +
                 patronymic +
                ". Отдел=" + department +
                ". Зарплата=" + salary;
    }
}
