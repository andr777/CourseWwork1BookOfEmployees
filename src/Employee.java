import java.util.Objects;

public class Employee {
    private String surname;         // фамилия
    private String name;            // имя
    private String patronymic;      // отчество
    private String department;      // отдел
    private double salary;          // зарплата
    private int id;                 // номер


    public Employee(String surname, String name, String patronymic, String department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = Main.idCounter;
        Main.idCounter++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ",  Фамилия='" + surname + '\'' +
                ",  Имя='" + name + '\'' +
                ",  Отчество='" + patronymic + '\'' +
                ",  Отдел='" + department + '\'' +
                ",  Зарплата=" + salary
                ;
    }

    public String toStringFullName() {
        return surname + ' ' + name + ' ' + patronymic + ' ';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, department, salary, id);
    }


    /* FULL NAME.

     */
}
