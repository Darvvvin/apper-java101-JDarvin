package zoo.internal;

import zoo.Animals;

public class Employees {
    public String name;
    double salary;

    Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void feedAnimal(Animals animal) {
        System.out.println("Feeding " + animal.name);
        animal.chewFood();
    }

    // Getters
    public String getName() {
        return name;
    }
}
