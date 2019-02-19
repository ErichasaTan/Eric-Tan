public class Main {

    public int Id;
    String firstName;
    String lastName;
    public int salary;

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName() {
        return firstName + lastName;

    }

    public int getSalary() {
        return salary;
    }

    public void getSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent) {
        int newSalary =(salary * percent) + salary;
        return newSalary;
    }

    public String toString(){
        return "Employee[Id = " + Id + ", Name =" + firstName + lastName + ", Salary = " + salary + "] ";
    }
}
