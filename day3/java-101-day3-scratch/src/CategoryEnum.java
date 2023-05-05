public class CategoryEnum {
    public static void main(String[] args) {
        Category chosenCategory  = Category.MEN;

        switch (chosenCategory) {
            case MEN:
                System.out.println(Category.MEN.getPrice());
                break;
            case WOMEN:
                System.out.println(Category.WOMEN.getPrice());
                break;
            case KID:
                System.out.println(Category.KID.getPrice());
                break;
            case GRANDMA:
                System.out.println(Category.GRANDMA.getPrice());
                break;
            case GRANDPA:
                System.out.println(Category.GRANDPA.getPrice());
                break;
        }
    }

    public enum Category {
        MEN(13.57), WOMEN(20.45), KID(45.6), GRANDMA(56.67), GRANDPA(3.56);

        private final double price;

        Category(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
