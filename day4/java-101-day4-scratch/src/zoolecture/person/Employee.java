package zoolecture.person;

import zoolecture.Animal;

public class Employee extends Human {
    double salary;

    void feedAnimal(Animal animal) {
        animal.chewFood();
    }
}
