package zoo;

public class Animals {
    public String name;
    public String type;
    public String food;

    Animals(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public void makeSound() {
        switch (this.type) {
            case "Dog":
                System.out.println("Bark!");
            case "Cat":
                System.out.println("Meow!");
            default:
                System.out.println("Some animal noise!");
        }
    }

    public void chewFood() {
        System.out.println(name + " is chewing " + food);
    }

    // Getters
    public String getName() {
        return name;
    }
}
