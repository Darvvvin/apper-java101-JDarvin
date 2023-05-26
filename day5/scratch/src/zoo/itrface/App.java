package zoo.itrface;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breath();

//        Fish fish = new Fish();
//        fish.breath();

        ForWaterOnly a = new Fish();
        ForWaterOnly b = new Croc();

        executeForWaterOnly(a);
        executeForWaterOnly(b);
    }

    static void executeForWaterOnly(ForWaterOnly f) {
        f.swim();
    }
}
