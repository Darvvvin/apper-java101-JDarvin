package zoolecture.person;

public class Visitor extends Human{

    public int getAge() {
        return super.getAge(); // Super to get top method
    }
}
