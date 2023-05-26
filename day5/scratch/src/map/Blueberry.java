package map;

public class Blueberry implements Cake{
    // Child, extends to parent. Class implements to interface
    @Override
    public void slice() {
        System.out.println("Slicing the blueberry cake... Yum!");
    }
}
