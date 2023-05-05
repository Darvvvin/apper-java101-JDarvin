public class SwitchStatements {
    public static void main(String[] args) {
        // Sound of the animals
        // Dog
        // Cat
        // Goat
        // Cow

        String animal = "cat";

        if(animal.equals("dog")) {
            System.out.println("arf");
        } else if(animal.equals("cat")) {
            System.out.println("meow");
        } else if(animal.equals("goat")) {
            System.out.println("meh");
        } else if(animal.equals("cow")) {
            System.out.println("moo");
        } else {
            System.out.println("Yay!");
        }

        switch (animal) {
            case "dog":
                System.out.println("woof");
                break;
            case "cat":
                System.out.println("meow");
                break;
            case "goat":
                System.out.println("meh");
                break;
            case "cow":
                System.out.println("moo");
                break;
            default:
                System.out.println("yay!");
        }

        // Enum -> Restrict variable to ONLY certain values
        Animal eAnimal = Animal.DOG;

        switch (eAnimal) {
            case DOG:
                System.out.println("woof");
                break;
            case CAT:
                System.out.println("meow");
                break;
            case GOAT:
                System.out.println("meh");
                break;
            case COW:
                System.out.println("moo");
                break;
        }

        System.out.println(Animal.GOAT.getDescription());

    }

    public enum Animal {
        DOG("favorite pet"), CAT, GOAT, COW;

        private final String description;

        Animal(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
