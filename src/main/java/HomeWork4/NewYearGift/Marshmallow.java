package HomeWork4.NewYearGift;

/**
 * @author Alexander Krasnov
 */
public class Marshmallow extends Gifts {
    private String smell;

    public Marshmallow(String name, double weight, int price, String smell) {
        super(name, weight, price);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    @Override
    public String toString() {
        return "Marshmallow " + "with " + smell + " smell" + super.toString();
    }
}
