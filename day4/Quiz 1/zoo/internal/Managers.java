package zoo.internal;

public class Managers {
    public String name;
    private final int age;
    public String initialTitle;

    Managers(String name, int age, String initialTitle) {
        this.name = name;
        this.age = age;
        this.initialTitle = initialTitle;
    }

    private void viewEmployeeSalary(Employees employee) {
        System.out.println("The salary of " + employee.name + " is " + employee.salary);
    }

    // Getters
    public String getName() {
        return initialTitle + " " + name;
    }

    public int getAge() {
        return age;
    }
}
