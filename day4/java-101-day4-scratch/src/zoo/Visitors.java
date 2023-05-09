package zoo;

public class Visitors {
    public String name;
    private final int age;

    Visitors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void retrieveNameAndAge() {
        System.out.println("My name is " + name + " and I am " + age + " years old!" );
    }
}
