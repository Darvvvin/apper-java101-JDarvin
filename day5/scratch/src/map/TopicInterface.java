package map;

public class TopicInterface {
    public static void main(String[] args) {
        Blueberry blueberry = new Blueberry();

        // If blueberry is a cake, slice the blueberry
        if (blueberry instanceof Cake) {
            blueberry.slice();
        }
    }
}
