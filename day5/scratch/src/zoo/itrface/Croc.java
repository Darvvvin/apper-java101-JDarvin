package zoo.itrface;

public class Croc extends Animal implements ForWaterOnly{
    @Override
    public void swim() {
        System.out.println("Croc Swimming");
    }
}
