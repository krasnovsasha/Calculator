package HomeWork4.NewYearGift;


/**
 * @author Alexander Krasnov
 * Gifts is a parent class for Candy, JellyBean, Marshmallow
 */
public abstract class Gifts {
    private String name;
    private double weight;
    private int price;

    public Gifts(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n******\nName = " + name + "\nWeight = " + weight + " gr\nPrice = " + price + " rub\n******\n";
    }

}
