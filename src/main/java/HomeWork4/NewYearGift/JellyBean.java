package HomeWork4.NewYearGift;

/**
 * @author Alexander Krasnov
 */
public class JellyBean extends Gifts {
    private String color;

    public JellyBean(String name, double weight, int price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "JellyBean " + "with " + color + " color" + super.toString();
    }
}
