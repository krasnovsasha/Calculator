package HomeWork4.NewYearGift;

/**
 * @author Alexander Krasnov
 */
public class Candy extends Gifts {
    private String flavor;

    public Candy(String name, double weight, int price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }


    @Override
    public String toString() {
        return "Candy " + "with " + flavor + " flavor" + super.toString();
    }
}
